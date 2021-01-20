package com.nsimat.lil.sbet.landon.roomwebapp.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    @Override
    public String toString(){
        switch (this){
            case HOUSEKEEPING:
                return "Housekeeping";
            case FRONT_DESK:
                return "Front Desk";
            case SECURITY:
                return "Security";
            case CONCIERGE:
                return "Concierge";
        }
        return "";
    }
}
