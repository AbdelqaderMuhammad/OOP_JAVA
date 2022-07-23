package enums;

public enum Levels {

    LOW(0) {
        @Override
        public String getName() {
            return "hello I am low";
        }
        @Override
        public String getNormalString(){
          return "string is low";
        }
    },
    MID(1) {
        @Override
        public String getName() {
            return "hello I am medium";
        }
        @Override
        public String getNormalString(){
            return "string is low";
        }
    },
    HIGH(2) {
        @Override
        public String getName() {
            return "hello I am high";
        }
        @Override
        public String getNormalString(){
            return "string is low";
        }
    };

    private int l;
    private String normalString;

    public String getNormalString() {
        return normalString;
    }

    Levels(int l) {
        this.l = l;
    }

    public int getLevelCode() {
        return l;
    }

    public abstract String getName();


}
