package org.launchcode.studio7;

import java.util.HashMap;
import java.util.Map;

public interface OpticalDisc {
    static final Map<String, Integer> CAPACITIES = new HashMap<>() {{
        put("CD", 700);
        put ("DVD", 17000);
    }};
}
