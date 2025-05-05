public enum Role {
    TAILOR, CHECKER, PACKAGER;
    public static int getBonusForRole(Role role){
        return switch (role){
            case TAILOR -> 500;
            case CHECKER -> 300;
            case PACKAGER -> 200;
        };
    }

    public int getBonus(){
        return Role.getBonusForRole(this);
    }
}
