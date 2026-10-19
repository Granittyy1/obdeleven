package com.voltasit.obdeleven.presentation.controlUnit.info;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: InfoItem.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f31662e;

    public h(String title, String action, String actionTitle, String description, List<String> options) {
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(action, "action");
        kotlin.jvm.internal.i.e(actionTitle, "actionTitle");
        kotlin.jvm.internal.i.e(description, "description");
        kotlin.jvm.internal.i.e(options, "options");
        this.f31658a = title;
        this.f31659b = action;
        this.f31660c = actionTitle;
        this.f31661d = description;
        this.f31662e = options;
    }

    public static h a(h hVar, String str, ArrayList arrayList, int i10) {
        String title = hVar.f31658a;
        String action = hVar.f31659b;
        String actionTitle = hVar.f31660c;
        if ((i10 & 8) != 0) {
            str = hVar.f31661d;
        }
        String description = str;
        List<String> list = arrayList;
        if ((i10 & 16) != 0) {
            list = hVar.f31662e;
        }
        List<String> options = list;
        hVar.getClass();
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(action, "action");
        kotlin.jvm.internal.i.e(actionTitle, "actionTitle");
        kotlin.jvm.internal.i.e(description, "description");
        kotlin.jvm.internal.i.e(options, "options");
        return new h(title, action, actionTitle, description, options);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.i.a(this.f31658a, hVar.f31658a) && kotlin.jvm.internal.i.a(this.f31659b, hVar.f31659b) && kotlin.jvm.internal.i.a(this.f31660c, hVar.f31660c) && kotlin.jvm.internal.i.a(this.f31661d, hVar.f31661d) && kotlin.jvm.internal.i.a(this.f31662e, hVar.f31662e);
    }

    public final int hashCode() {
        return this.f31662e.hashCode() + B1.a.b(this.f31661d, B1.a.b(this.f31660c, B1.a.b(this.f31659b, this.f31658a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "InfoItem(title=" + this.f31658a + ", action=" + this.f31659b + ", actionTitle=" + this.f31660c + ", description=" + this.f31661d + ", options=" + this.f31662e + ")";
    }

    public h(String str, String str2, String str3, String str4, EmptyList emptyList, int i10) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, str4, (i10 & 16) != 0 ? EmptyList.f42983b : emptyList);
    }
}
