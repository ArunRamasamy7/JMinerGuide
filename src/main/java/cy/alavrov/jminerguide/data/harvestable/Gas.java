/*
 * Copyright (c) 2015, Andrey Lavrov <lavroff@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package cy.alavrov.jminerguide.data.harvestable;

/**
 * Gases.
 * Non-mission ones.
 * @author Andrey Lavrov <lavroff@gmail.com>
 */
public enum Gas implements IHarvestable{
    AMBERCYTOSEROCIN("Amber Cytoserocin", BasicHarvestable.CYTOSEROCIN),
    AZURECYTOSEROCIN("Azure Cytoserocin", BasicHarvestable.CYTOSEROCIN),
    CELADONCYTOSEROCIN("Celadon Cytoserocin", BasicHarvestable.CYTOSEROCIN),
    GOLDENCYTOSEROCIN("Golden Cytoserocin", BasicHarvestable.CYTOSEROCIN),
    LIMECYTOSEROCIN("Lime Cytoserocin", BasicHarvestable.CYTOSEROCIN),
    MALACHITECYTOSEROCIN("Malachite Cytoserocin", BasicHarvestable.CYTOSEROCIN),
    VERMILLIONCYTOSEROCIN("Vermillion Cytoserocin", BasicHarvestable.CYTOSEROCIN),
    VIRIDIANCYTOSEROCIN("Viridian Cytoserocin", BasicHarvestable.CYTOSEROCIN),

    AMBERMYKOSEROCIN("Amber Mykoserocin", BasicHarvestable.MYKOSEROCIN),
    AZUREMYKOSEROCIN("Azure Mykoserocin", BasicHarvestable.MYKOSEROCIN),
    CELADONMYKOSEROCIN("Celadon Mykoserocin", BasicHarvestable.MYKOSEROCIN),
    GOLDENMYKOSEROCIN("Golden Mykoserocin", BasicHarvestable.MYKOSEROCIN),
    LIMEMYKOSEROCIN("Lime Mykoserocin", BasicHarvestable.MYKOSEROCIN),
    MALACHITEMYKOSEROCIN("Malachite Mykoserocin", BasicHarvestable.MYKOSEROCIN),
    VERMILLIONMYKOSEROCIN("Vermillion Mykoserocin", BasicHarvestable.MYKOSEROCIN),
    VIRIDIANMYKOSEROCIN("Viridian Mykoserocin", BasicHarvestable.MYKOSEROCIN),

    FULLERITEC28("Fullerite-C28", BasicHarvestable.FULLERITEC28),
    FULLERITEC32("Fullerite-C32", BasicHarvestable.FULLERITEC32),
    FULLERITEC50("Fullerite-C50", BasicHarvestable.FULLERITEC50),
    FULLERITEC60("Fullerite-C60", BasicHarvestable.FULLERITEC60),
    FULLERITEC70("Fullerite-C70", BasicHarvestable.FULLERITEC70),
    FULLERITEC72("Fullerite-C72", BasicHarvestable.FULLERITEC72),
    FULLERITEC84("Fullerite-C84", BasicHarvestable.FULLERITEC84),
    FULLERITEC320("Fullerite-C320", BasicHarvestable.FULLERITEC320),
    FULLERITEC540("Fullerite-C540", BasicHarvestable.FULLERITEC540);

    private Gas(String name, BasicHarvestable basicType) {
        this.name = name;
        this.basicType = basicType;
    }
    
        
    private final String name;
    private final BasicHarvestable basicType;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BasicHarvestable getBasicHarvestable() {
        return basicType;
    }

    @Override
    public boolean isHighYield() {
        return false;
    }

    @Override
    public boolean isQuest() {
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
        
    
}
