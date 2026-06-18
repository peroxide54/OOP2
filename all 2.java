public double evaluate(String expression) throws Exception {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");
    String prepared = expression.replace("**", "^");
    Object result = engine.eval(prepared);
    return Double.parseDouble(result.toString());
}