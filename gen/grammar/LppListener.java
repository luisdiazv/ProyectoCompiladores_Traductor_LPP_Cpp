// Generated from C:/Principal/Universidad/2_Lenguajes de Programación/Traductor_Lpp2Cpp/src/grammar/Lpp.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LppParser}.
 */
public interface LppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LppParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LppParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LppParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#declaracionesRegistros}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionesRegistros(LppParser.DeclaracionesRegistrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#declaracionesRegistros}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionesRegistros(LppParser.DeclaracionesRegistrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#declaracionRegistro}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionRegistro(LppParser.DeclaracionRegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#declaracionRegistro}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionRegistro(LppParser.DeclaracionRegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#declaracionesSubprogramas}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionesSubprogramas(LppParser.DeclaracionesSubprogramasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#declaracionesSubprogramas}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionesSubprogramas(LppParser.DeclaracionesSubprogramasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#declaracionProcedimiento}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionProcedimiento(LppParser.DeclaracionProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#declaracionProcedimiento}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionProcedimiento(LppParser.DeclaracionProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(LppParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(LppParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LppParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LppParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LppParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LppParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#declaracionesVariables}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionesVariables(LppParser.DeclaracionesVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#declaracionesVariables}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionesVariables(LppParser.DeclaracionesVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#declaracionVariables}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariables(LppParser.DeclaracionVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#declaracionVariables}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariables(LppParser.DeclaracionVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LppParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LppParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#tipoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterTipoFuncion(LppParser.TipoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#tipoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitTipoFuncion(LppParser.TipoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void enterListaIDs(LppParser.ListaIDsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void exitListaIDs(LppParser.ListaIDsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#listaEnteros}.
	 * @param ctx the parse tree
	 */
	void enterListaEnteros(LppParser.ListaEnterosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#listaEnteros}.
	 * @param ctx the parse tree
	 */
	void exitListaEnteros(LppParser.ListaEnterosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#accionesSubprograma}.
	 * @param ctx the parse tree
	 */
	void enterAccionesSubprograma(LppParser.AccionesSubprogramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#accionesSubprograma}.
	 * @param ctx the parse tree
	 */
	void exitAccionesSubprograma(LppParser.AccionesSubprogramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#accionesFuncion}.
	 * @param ctx the parse tree
	 */
	void enterAccionesFuncion(LppParser.AccionesFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#accionesFuncion}.
	 * @param ctx the parse tree
	 */
	void exitAccionesFuncion(LppParser.AccionesFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#accionesPrograma}.
	 * @param ctx the parse tree
	 */
	void enterAccionesPrograma(LppParser.AccionesProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#accionesPrograma}.
	 * @param ctx the parse tree
	 */
	void exitAccionesPrograma(LppParser.AccionesProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#acciones}.
	 * @param ctx the parse tree
	 */
	void enterAcciones(LppParser.AccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#acciones}.
	 * @param ctx the parse tree
	 */
	void exitAcciones(LppParser.AccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(LppParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(LppParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#escriba}.
	 * @param ctx the parse tree
	 */
	void enterEscriba(LppParser.EscribaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#escriba}.
	 * @param ctx the parse tree
	 */
	void exitEscriba(LppParser.EscribaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#lea}.
	 * @param ctx the parse tree
	 */
	void enterLea(LppParser.LeaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#lea}.
	 * @param ctx the parse tree
	 */
	void exitLea(LppParser.LeaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#asignar}.
	 * @param ctx the parse tree
	 */
	void enterAsignar(LppParser.AsignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#asignar}.
	 * @param ctx the parse tree
	 */
	void exitAsignar(LppParser.AsignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#llamar}.
	 * @param ctx the parse tree
	 */
	void enterLlamar(LppParser.LlamarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#llamar}.
	 * @param ctx the parse tree
	 */
	void exitLlamar(LppParser.LlamarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#procedimientoLibreriaEstandar}.
	 * @param ctx the parse tree
	 */
	void enterProcedimientoLibreriaEstandar(LppParser.ProcedimientoLibreriaEstandarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#procedimientoLibreriaEstandar}.
	 * @param ctx the parse tree
	 */
	void exitProcedimientoLibreriaEstandar(LppParser.ProcedimientoLibreriaEstandarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(LppParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(LppParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(LppParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(LppParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(LppParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(LppParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#opcionCaso}.
	 * @param ctx the parse tree
	 */
	void enterOpcionCaso(LppParser.OpcionCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#opcionCaso}.
	 * @param ctx the parse tree
	 */
	void exitOpcionCaso(LppParser.OpcionCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#listaExprOpcion}.
	 * @param ctx the parse tree
	 */
	void enterListaExprOpcion(LppParser.ListaExprOpcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#listaExprOpcion}.
	 * @param ctx the parse tree
	 */
	void exitListaExprOpcion(LppParser.ListaExprOpcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#casoSino}.
	 * @param ctx the parse tree
	 */
	void enterCasoSino(LppParser.CasoSinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#casoSino}.
	 * @param ctx the parse tree
	 */
	void exitCasoSino(LppParser.CasoSinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(LppParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(LppParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(LppParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(LppParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#repita}.
	 * @param ctx the parse tree
	 */
	void enterRepita(LppParser.RepitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#repita}.
	 * @param ctx the parse tree
	 */
	void exitRepita(LppParser.RepitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#retorne}.
	 * @param ctx the parse tree
	 */
	void enterRetorne(LppParser.RetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#retorne}.
	 * @param ctx the parse tree
	 */
	void exitRetorne(LppParser.RetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#listaExpr}.
	 * @param ctx the parse tree
	 */
	void enterListaExpr(LppParser.ListaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#listaExpr}.
	 * @param ctx the parse tree
	 */
	void exitListaExpr(LppParser.ListaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LppParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LppParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LppParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(LppParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LppParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(LppParser.ValorContext ctx);
}