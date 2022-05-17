package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ProjectTarief extends Tarief{
    String beschrijvingProject;

    public ProjectTarief(double tarief, String beschrijvingProject) {
        super(tarief);
        this.beschrijvingProject = beschrijvingProject;
    }

    public String getBeschrijvingProject() {
        return beschrijvingProject;
    }

    @Override
    public String toString() {
        return "beschrijvingProject: '" + beschrijvingProject + '\'' +
                " tarief: " + tarief + '\'' +
                " verdient: " + verdient;
    }

}
