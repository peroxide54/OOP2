public void processCommand(String input) {
    if (input.matches(".*[+\\-*/^%()].*")) {
        double result = model.evaluate(input);
        view.showResult(result);
        history.add(input + " = " + result);
    } else if (input.startsWith("save")) {
    }
    // ... и т.д.
}