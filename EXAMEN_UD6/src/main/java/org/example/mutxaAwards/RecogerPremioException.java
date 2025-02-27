package org.example.mutxaAwards;

public class RecogerPremioException extends RuntimeException {
    public RecogerPremioException() {
        super("Se a intentado recojer un premio que no gano");
    }
}
