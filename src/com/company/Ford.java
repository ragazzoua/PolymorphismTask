package com.company;

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitshubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitshubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitshubishi -> brake()";
    }
}

