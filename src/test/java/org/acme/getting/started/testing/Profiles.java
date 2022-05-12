package org.acme.getting.started.testing;

import java.util.Collections;
import java.util.Set;

import io.quarkus.test.junit.QuarkusTestProfile;

public class Profiles {

    public static class SingleTag implements QuarkusTestProfile {
        @Override
        public Set<String> tags() {
            return Collections.singleton("greeting");
        }
    }

    public static class StaticTag implements QuarkusTestProfile {
        @Override
        public Set<String> tags() {
            return Collections.singleton("static");
        }
    }

    public static class ServiceTag implements QuarkusTestProfile {
        @Override
        public Set<String> tags() {
            return Collections.singleton("service");
        }
    }
    
}
