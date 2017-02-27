package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

public class Tags {

    private String blockLabel;
    private String  subBlockLabel;
    private String subBlockPrefix;

    public String getBlockLabel() {
        return blockLabel;
    }

    public String getSubBlockLabel() {
        return subBlockLabel;
    }

    public String getSubBlockPrefix() {
        return subBlockPrefix;
    }

    @Override
    public String toString() {
        return "Tags{" +
                "blockLabel='" + blockLabel + '\'' +
                ", subBlockLabel='" + subBlockLabel + '\'' +
                ", subBlockPrefix='" + subBlockPrefix + '\'' +
                '}';
    }
}
