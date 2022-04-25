package com.design.patterns.creational.builder.account;

public class Nominee {
    private final String nomineeName;
    private final String relation;
    private final Integer nomineeAge;

    public Nominee(String nomineeName, String relation, Integer nomineeAge) {
        this.nomineeName = nomineeName;
        this.relation = relation;
        this.nomineeAge = nomineeAge;
    }

    @Override
    public String toString() {
        return "Nominee{" +
                "nomineeName='" + nomineeName + '\'' +
                ", relation='" + relation + '\'' +
                ", nomineeAge=" + nomineeAge +
                '}';
    }
}