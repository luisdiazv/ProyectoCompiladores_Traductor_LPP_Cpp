// Generated from C:/Principal/Universidad/2_Lenguajes de Programación/Traductor_Lpp2Cpp/src/grammar/Lpp.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LppVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LppParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LppParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#declaracionesRegistros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesRegistros(LppParser.DeclaracionesRegistrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#declaracionRegistro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionRegistro(LppParser.DeclaracionRegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#declaracionesSubprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesSubprogramas(LppParser.DeclaracionesSubprogramasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#declaracionProcedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionProcedimiento(LppParser.DeclaracionProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(LppParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LppParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(LppParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#declaracionesVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesVariables(LppParser.DeclaracionesVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#declaracionVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariables(LppParser.DeclaracionVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LppParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#tipoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoFuncion(LppParser.TipoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#listaIDs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIDs(LppParser.ListaIDsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#listaEnteros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaEnteros(LppParser.ListaEnterosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#accionesSubprograma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionesSubprograma(LppParser.AccionesSubprogramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#accionesFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionesFuncion(LppParser.AccionesFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#accionesPrograma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionesPrograma(LppParser.AccionesProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#acciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcciones(LppParser.AccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(LppParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#escriba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscriba(LppParser.EscribaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#lea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLea(LppParser.LeaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignar(LppParser.AsignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#llamar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar(LppParser.LlamarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#procedimientoLibreriaEstandar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimientoLibreriaEstandar(LppParser.ProcedimientoLibreriaEstandarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LppParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(LppParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(LppParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#opcionCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcionCaso(LppParser.OpcionCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#listaExprOpcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExprOpcion(LppParser.ListaExprOpcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#casoSino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoSino(LppParser.CasoSinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(LppParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(LppParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#repita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepita(LppParser.RepitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#retorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorne(LppParser.RetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#listaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpr(LppParser.ListaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LppParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LppParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(LppParser.ValorContext ctx);
}