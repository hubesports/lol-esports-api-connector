package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

public class MatchType {

    private String identifier;
    private Options options;

    public String getIdentifier() {
        return identifier;
    }

    public Options getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "MatchType{" +
                "identifier='" + identifier + '\'' +
                ", options=" + options +
                '}';
    }

    public class Options{
        private String best_of;

        public String getBest_of() {
            return best_of;
        }

        @Override
        public String toString() {
            return "options{" +
                    "best_of='" + best_of + '\'' +
                    '}';
        }
    }
}
