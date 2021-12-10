package com.mgr.badanie.recounting;

import java.math.BigDecimal;

public interface GrossNetService {

    BigDecimal grossToNet(BigDecimal gross);

    BigDecimal NetToGross(BigDecimal net);
}
