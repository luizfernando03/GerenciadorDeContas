package com.Spring.GerenciadorDeContas.Model.Enum;

import javax.ws.rs.PUT;
import java.util.Iterator;

public enum Status implements ch.qos.logback.core.status.Status {
    AGUARDANDO, PAGO, VENCIDA;

    public Status getAguardando() {return AGUARDANDO;}
    public Status getPago() {return PAGO;}
    public Status getVencida() {return VENCIDA;}

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEffectiveLevel() {
        return 0;
    }

    @Override
    public Object getOrigin() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }

    @Override
    public Long getDate() {
        return null;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public void add(ch.qos.logback.core.status.Status child) {
        
    }

    @Override
    public boolean remove(ch.qos.logback.core.status.Status child) {
        return false;
    }

    @Override
    public Iterator<ch.qos.logback.core.status.Status> iterator() {
        return null;
    }
}
