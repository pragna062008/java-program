interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartFan implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("SMART FAN: TURNED ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SMART FAN: TURNED OFF");
    }
}

class SmartLight implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("SMART LIGHT: TURNED ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SMART LIGHT: TURNED OFF");
    }
}

class SmartAC implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("SMART AC: TURNED ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SMART AC: TURNED OFF");
    }
}

class Main {
    public static void main(String[] args) {

        SmartDevice device;

        device = new SmartFan();
        device.turnOn();
        device.turnOff();

        device = new SmartLight();
        device.turnOn();
        device.turnOff();

        device = new SmartAC();
        device.turnOn();
        device.turnOff();

        device = null;

        try {
            device.turnOn();
        } catch (NullPointerException e) {
            System.out.println("NULL INTERFACE REFERENCE");
        }

        System.out.println("SmartFan must implement all interface methods");
        System.out.println("Interface SmartDevice cannot be instantiated");
        System.out.println("NULL interface reference causes NullPointerException");
    }
}
