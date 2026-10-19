package com.voltasit.obdeleven.domain.usecases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: GetDaysLeftUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.f f30859a;

    public j(J8.f fVar) {
        this.f30859a = fVar;
    }

    public final C8.a<Integer> a(String dateString) {
        kotlin.jvm.internal.i.e(dateString, "dateString");
        if (kotlin.text.n.S(dateString)) {
            return new C8.a.b(-1);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            double time = simpleDateFormat.parse(dateString).getTime() - this.f30859a.b();
            return time < 0.0d ? new C8.a.b(0) : new C8.a.b(Integer.valueOf((int) Math.ceil(time / ((double) 86400000))));
        } catch (ParseException e10) {
            return new C8.a.C0024a(e10);
        }
    }
}
