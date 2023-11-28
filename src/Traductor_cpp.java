import grammar.LppParser;
import grammar.LppBaseListener;
import java.util.regex.*;

public class Traductor_cpp extends LppBaseListener {

    private boolean en_Arreglo = false;
    private boolean en_Param = false;
    private boolean Funcion_sin_retorno = false;
    private int contador_param;
    private String aux = "";
    private String aux_2 = "";

    @Override
    public void enterPrograma(LppParser.ProgramaContext ctx) {
        System.out.println("#include <cmath>");
        System.out.println("#include <iostream>\n");

        System.out.println("using namespace std;");
    }

    @Override
    public void exitDeclaracionesRegistros(LppParser.DeclaracionesRegistrosContext ctx) {
        System.out.print("\n");
    }

    @Override
    public void enterDeclaracionRegistro(LppParser.DeclaracionRegistroContext ctx) {
        System.out.printf("\nstruct %s {\n",ctx.ID().getText().toLowerCase());
    }

    @Override
    public void exitDeclaracionRegistro(LppParser.DeclaracionRegistroContext ctx) {
        System.out.print("};\n");
    }

    @Override
    public void enterDeclaracionProcedimiento(LppParser.DeclaracionProcedimientoContext ctx) {
        System.out.printf("\nvoid %s",ctx.ID().getText().toLowerCase());

        if (ctx.parametros() != null){
            System.out.print("(");
        }
        else{
            System.out.print("() {\n");
        }

    }

    @Override
    public void exitDeclaracionProcedimiento(LppParser.DeclaracionProcedimientoContext ctx) {
        System.out.print("}\n");
    }

    @Override
    public void enterDeclaracionFuncion(LppParser.DeclaracionFuncionContext ctx) {

        if (ctx.accionesFuncion().retorne() == null){
            Funcion_sin_retorno  = true;
        }

        aux = ctx.ID().getText().toLowerCase();
        enterTipoFuncion(ctx.tipoFuncion());

        if (Funcion_sin_retorno){
            System.out.print("\nvoid " + aux);
        }
        else{
            System.out.print("\n" + aux_2 + aux);
        }

        if (ctx.parametros() != null){
            System.out.print("(");
        }
        else{
            System.out.print("() {\n");
        }

        aux_2 = "";
        Funcion_sin_retorno = false;
    }

    @Override
    public void exitDeclaracionFuncion(LppParser.DeclaracionFuncionContext ctx) {
        System.out.print("}\n");
    }

    @Override
    public void enterParametros(LppParser.ParametrosContext ctx) {
        en_Param = true;
        contador_param = ctx.parametro().size()-1;
    }

    @Override
    public void exitParametros(LppParser.ParametrosContext ctx) {
        en_Param = false;
        System.out.print("){"+"\n");
    }

    @Override
    public void enterParametro(LppParser.ParametroContext ctx) {
        aux_2 = String.format("%s", ctx.ID().getText());
    }

    @Override
    public void exitParametro(LppParser.ParametroContext ctx) {
        if (contador_param != 0){
            contador_param--;
            System.out.print(", ");
        }
    }

    @Override
    public void enterDeclaracionVariables(LppParser.DeclaracionVariablesContext ctx) {
        aux_2 = ctx.listaIDs().getText().toLowerCase();
    }

    @Override
    public void exitDeclaracionVariables(LppParser.DeclaracionVariablesContext ctx) {
        System.out.print("; \n");
    }

    @Override
    public void enterTipo(LppParser.TipoContext ctx) {
        if (ctx.ENTERO() != null) {
            System.out.print("int ");
            if (en_Arreglo) {
                System.out.printf("%s %s",aux_2,aux);
                aux = "";
            }
            else if (en_Param){
                System.out.printf("%s",aux_2);
                aux_2 = "";
            }
            else{
                System.out.print(" ");
            }
        }
        else if (ctx.REAL() != null) {
            System.out.print("float ");
            if (en_Arreglo) {
                System.out.printf("%s %s",aux_2,aux);
                aux = "";
            }
            else if (en_Param){
                System.out.printf("%s",aux_2);
                aux_2 = "";
            }
            else{
                System.out.print(" ");
            }
        }
        else if (ctx.BOOLEANO() != null) {
            System.out.print("bool ");
            if (en_Arreglo) {
                System.out.printf("%s %s",aux_2,aux);
                aux = "";
            }
            else if (en_Param){
                System.out.printf("%s",aux_2);
                aux_2 = "";
            }
            else{
                System.out.print(" ");
            }
        }
        else if (ctx.CARACTER() != null) {
            System.out.print("char ");
            if (en_Arreglo) {
                System.out.printf("%s %s",aux_2,aux);
                aux = "";
            }
            else if (en_Param){
                System.out.printf("%s",aux_2);
                aux_2 = "";
            }
            else{
                System.out.print(" ");
            }
        }
        else if (ctx.CADENA() != null) {
            System.out.print("string ");
            if (en_Arreglo) {
                System.out.printf("%s %s",aux_2,aux);
                aux = "";
            }
            else if (en_Param){
                System.out.printf("%s",aux_2);
                aux_2 = "";
            }
            else{
                System.out.print(" ");
            }
        }
        else if (ctx.ID() != null) {
            System.out.printf("%s ", ctx.ID().getText().toLowerCase());
            if (en_Arreglo) {
                System.out.printf("%s %s",aux_2,aux);
                aux = "";
                aux_2 = "";
            }
            else if (en_Param){
                System.out.printf("%s ",aux_2);
                aux_2 = "";
            }
        }else if (ctx.ARREGLO() != null) {
            en_Arreglo = true;
        }
    }

    @Override
    public void enterTipoFuncion(LppParser.TipoFuncionContext ctx) {
        if (ctx.ENTERO() != null) {
            aux_2 = "int ";
        }
        else if (ctx.REAL() != null){
            aux_2 = "float ";
        }
        else if (ctx.BOOLEANO() != null){
            aux_2 = "bool ";
        }
        else if (ctx.CARACTER() != null){
            aux_2 = "char ";
        }
        else if (ctx.CADENA() != null) {
            aux_2 = "string ";
        }
        else if (ctx.ID() != null) {
            aux_2 = String.format("%s ", ctx.ID().getText().toLowerCase());
        }
    }

    @Override
    public void enterListaIDs(LppParser.ListaIDsContext ctx) {
        if (en_Arreglo){
            en_Arreglo = false;
        }else{
            System.out.printf("%s",ctx.ID(0).getText().toLowerCase());
            int c = 1;
            while (ctx.ID().size() != c){
                System.out.printf(", %s",ctx.ID(c).getText().toLowerCase());
                c++;
            }
        }
    }

    @Override
    public void enterListaEnteros(LppParser.ListaEnterosContext ctx) {
        int c=0;
        while (ctx.VALOR_ENTERO().size() != c){
            aux = aux + String.format("[%s]",ctx.VALOR_ENTERO(c));
            c++;
        }
    }

    @Override
    public void enterAccionesPrograma(LppParser.AccionesProgramaContext ctx) {
        System.out.print("\nint main() {\n");
    }

    @Override
    public void exitAccionesPrograma(LppParser.AccionesProgramaContext ctx) {
        System.out.print("return 0;\n");
        System.out.print("}");
    }

    @Override
    public void enterEscriba(LppParser.EscribaContext ctx) {
        System.out.print("cout ");
        int c = 0;
        while (ctx.listaExpr().expr().size() != c){
            System.out.printf("<< %s ",ExprAnalysis(ctx.listaExpr().expr(c)));
            c++;
        }
    }

    @Override
    public void exitEscriba(LppParser.EscribaContext ctx) {
        System.out.print(";\n");
    }

    @Override
    public void enterLea(LppParser.LeaContext ctx) {
        System.out.print("cin ");
        int c = 0;
        while (ctx.listaExpr().expr().size() != c){
            System.out.printf(">> %s ",ExprAnalysis(ctx.listaExpr().expr(c)));
            c++;
        }

    }

    @Override
    public void exitLea(LppParser.LeaContext ctx) {
        System.out.print(";\n");
        System.out.print(";\n");
    }

    @Override
    public void enterAsignar(LppParser.AsignarContext ctx) {
        System.out.printf(
                "%s = %s",
                ExprAnalysis(ctx.expr(0)),
                ExprAnalysis(ctx.expr(1))
        );
    }

    @Override
    public void exitAsignar(LppParser.AsignarContext ctx) {
        System.out.print(";\n");
    }

    @Override
    public void enterLlamar(LppParser.LlamarContext ctx) {
        if (ctx.ID() != null) {
            System.out.printf("\n%s(", ctx.ID().getText().toLowerCase());
        }
    }

    @Override
    public void exitLlamar(LppParser.LlamarContext ctx) {
        if (ctx.ID() != null) {
            System.out.print(");\n");
        }
    }

    @Override
    public void enterProcedimientoLibreriaEstandar(LppParser.ProcedimientoLibreriaEstandarContext ctx) {
        System.out.print("cout << \"\" << endl;\n");
    }

    @Override
    public void enterSi(LppParser.SiContext ctx) {
        System.out.println("if( " + ExprAnalysis(ctx.expr()) + " ) {");
    }

    @Override
    public void exitSi(LppParser.SiContext ctx) {
        if (ctx.sino() == null && ctx.SI() == null){
            System.out.println("}");
        }
    }

    @Override
    public void enterSino(LppParser.SinoContext ctx) {
        if (ctx.si() == null){
            System.out.println(" } else { ");
        }else{
            System.out.print(" } else ");
        }
    }

    @Override
    public void exitSino(LppParser.SinoContext ctx) {
        if (ctx.si() == null) {
            System.out.println("}");
        }
    }

    @Override
    public void enterCaso(LppParser.CasoContext ctx) {
        System.out.printf("switch ( %s ){\n",ExprAnalysis(ctx.expr()));
    }

    @Override
    public void exitCaso(LppParser.CasoContext ctx) {
        if (ctx.casoSino() != null){
            System.out.print("");
        }else{
            System.out.print("default:\n");
            System.out.print("cout << \"\";\n");
        }
        System.out.print("}\n");
    }

    @Override
    public void exitOpcionCaso(LppParser.OpcionCasoContext ctx) {
        System.out.print("break;\n");
    }

    @Override
    public void enterListaExprOpcion(LppParser.ListaExprOpcionContext ctx) {
        for (int i = 0; i < ctx.expr().size();i++){
            System.out.printf("case %s:\n",ExprAnalysis(ctx.expr(i)));
        }
    }

    @Override
    public void enterCasoSino(LppParser.CasoSinoContext ctx) {
        System.out.print("default:\n");
    }

    @Override
    public void enterMientras(LppParser.MientrasContext ctx) {
        System.out.printf("while (%s) {\n",ExprAnalysis(ctx.expr()));
    }

    @Override
    public void exitMientras(LppParser.MientrasContext ctx) {
        System.out.print("}\n");
    }

    @Override
    public void enterPara(LppParser.ParaContext ctx) {
        System.out.println("for (int " + ExprAnalysis(ctx.expr(0)) + " = " + ExprAnalysis(ctx.expr(1)) + "; " + ExprAnalysis(ctx.expr(0)) + " <= " + ExprAnalysis(ctx.expr(2))+ "; " + ExprAnalysis(ctx.expr(0)) + "++" + ") {");
    }

    @Override
    public void exitPara(LppParser.ParaContext ctx) {
        System.out.print("}\n");
    }

    @Override
    public void enterRepita(LppParser.RepitaContext ctx) {
        System.out.print("do {\n");
    }

    @Override
    public void exitRepita(LppParser.RepitaContext ctx) {
        System.out.printf("} while (!( %s ));\n",ExprAnalysis(ctx.expr()));
    }

    @Override
    public void enterRetorne(LppParser.RetorneContext ctx) {
        System.out.printf("return %s;\n",ExprAnalysis(ctx.expr()));
    }

    private boolean havePow(LppParser.ExprContext ctx){
        boolean thereIsPow = false;
        int numberChild = ctx.children.size();
        for (int i = 0; i < numberChild; i++) {
            if(!(ctx.children.get(i) instanceof LppParser.ExprContext)){
                if(ctx.children.get(i).getText().equals("^")){
                    thereIsPow = true;
                }
            }
        }
        return thereIsPow;
    }

    private boolean haveDivEnt(LppParser.ExprContext ctx){
        boolean thereIsDiv = false;
        int numberChild = ctx.children.size();
        for (int i = 0; i < numberChild; i++) {
            if(!(ctx.children.get(i) instanceof LppParser.ExprContext)){
                if(ctx.children.get(i).getText().equals("div")){
                    thereIsDiv = true;
                }
            }
        }
        return thereIsDiv;
    }

    private boolean haveDivFloat(LppParser.ExprContext ctx){
        boolean thereIsDiv = false;
        int numberChild = ctx.children.size();
        for (int i = 0; i < numberChild; i++) {
            if(!(ctx.children.get(i) instanceof LppParser.ExprContext)){
                if(ctx.children.get(i).getText().equals("/")){
                    thereIsDiv = true;
                }
            }
        }
        return thereIsDiv;
    }

    private String ExprAnalysis(LppParser.ExprContext ctx) {
        //System.out.println("Entre " + ctx.getText());
        int numberChild = ctx.children.size();
        int exprCounter = 0;
        String output = "";
        String temp = "";

        boolean inPow = false;
        boolean inDivEnt = false;
        boolean inDivFloat = false;

        inPow = havePow(ctx);
        inDivEnt = haveDivEnt(ctx);
        inDivFloat = haveDivFloat(ctx);

        if(inPow){
            //System.out.println("TENGO POW");
            output += "pow(";
            if(ctx.children.get(0) instanceof LppParser.ExprContext){
                output += ExprAnalysis(ctx.expr(0));
            }else{
                output += ctx.children.get(2).getText();
            }
            output += ",";
            if(ctx.children.get(2) instanceof LppParser.ExprContext){
                output += ExprAnalysis(ctx.expr(1));
            }else{
                output += ctx.children.get(2).getText();
            }
            output += ")";
        }else if(inDivEnt){
            //System.out.println("TENGO DIV");
            output += "(int)((float)";
            if(ctx.children.get(0) instanceof LppParser.ExprContext){
                output += ExprAnalysis(ctx.expr(0));
            }else{
                output += ctx.children.get(2).getText();
            }
            output += "/(float)";
            if(ctx.children.get(2) instanceof LppParser.ExprContext){
                output += ExprAnalysis(ctx.expr(1));
            }else{
                output += ctx.children.get(2).getText();
            }
            output += ")";
        }else if(inDivFloat){
            output += "(float)((float)";
            if(ctx.children.get(0) instanceof LppParser.ExprContext){
                output += ExprAnalysis(ctx.expr(0));
            }else{
                output += ctx.children.get(2).getText();
            }
            output += "/(float)";
            if(ctx.children.get(2) instanceof LppParser.ExprContext){
                output += ExprAnalysis(ctx.expr(1));
            }else{
                output += ctx.children.get(2).getText();
            }
            output += ")";
        }else{
            for (int i = 0; i < numberChild; i++) {
                if (ctx.children.get(i) instanceof LppParser.ExprContext) {
                    output += ExprAnalysis(ctx.expr(exprCounter));
                    exprCounter++;
                }else if (ctx.children.get(i) instanceof LppParser.ValorContext){
                    String text = ctx.children.get(i).getText();
                    if (text.equalsIgnoreCase("verdadero")){
                        output += "true";
                    }
                    else if (text.equalsIgnoreCase("falso")){
                        output += "false";
                    }
                    else if (ctx.children.get(i) == ctx.valor().VALOR_CADENA() || ctx.children.get(i) == ctx.valor().VALOR_CARACTER()){
                        output += ctx.getChild(i).getText();
                    }
                    else {
                        output += text;
                    }
                }else{
                    String text = ctx.children.get(i).getText();

                    if (text.equalsIgnoreCase("Y")){
                        output += " && ";
                    }
                    else if (text.equalsIgnoreCase("O")){
                        output += " || ";
                    }
                    else if (text.equalsIgnoreCase("=")){
                        output += " == ";
                    }
                    else if (text.equalsIgnoreCase("<")){
                        output += " < ";
                    }
                    else if (text.equalsIgnoreCase("<=")){
                        output += " <= ";
                    }
                    else if (text.equalsIgnoreCase(">")){
                        output += " > ";
                    }
                    else if (text.equalsIgnoreCase(">=")){
                        output += " >= ";
                    }
                    else if (text.equalsIgnoreCase("<>")){
                        output += " != ";
                    }
                    else if (text.equalsIgnoreCase("mod")){
                        output += "%";
                    }
                    else {
                        output += text.toLowerCase();
                    }
                }
            }
        }
        output = output.replace("\"+\"","");
        return formatoSalidaExpr(output);
    }

    public static String formatoSalidaExpr(String input) {
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(input);

        StringBuffer output = new StringBuffer();
        while (matcher.find()) {
            String match = matcher.group(0);
            String replaced = match.replaceAll(",", "][");
            matcher.appendReplacement(output, replaced);
        }
        matcher.appendTail(output);

        return output.toString();
    }
}