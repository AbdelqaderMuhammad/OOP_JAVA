package enums;

public enum Levels {

    LOW(0) {
        @Override
        public String getName() {
            return "hello I am low";
        }
    },
    MID(1) {
        @Override
        public String getName() {
            return "hello I am medium";
        }
    },
    HIGH(2) {
        @Override
        public String getName() {
            return "hello I am high";
        }
    };

    private int l;

    Levels(int l) {
        this.l = l;
    }

    public int getLevelCode() {
        return l;
    }

    public abstract String getName();


}
