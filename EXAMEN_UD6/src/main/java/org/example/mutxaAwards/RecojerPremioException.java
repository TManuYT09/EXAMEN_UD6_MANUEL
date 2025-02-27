package org.example.mutxaAwards;

public class RecojerPremioException extends RuntimeException {
    public RecojerPremioException() {
        super("Se a intentado recojer un premio que no gano");
    }
}
