package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p228s6.a;

/* JADX INFO: loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {
    private final List<a<?>> componentsInCycle;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.componentsInCycle = arrayList;
    }
}
