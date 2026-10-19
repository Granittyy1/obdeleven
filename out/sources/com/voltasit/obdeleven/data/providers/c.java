package com.voltasit.obdeleven.data.providers;

import android.app.Activity;
import android.content.Context;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.Arrays;

/* JADX INFO: compiled from: ContextProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements J8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MainActivity f30259b;

    @Override // J8.d
    public final String a(int i10, Object... objArr) {
        String string = this.f30258a.getString(i10, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // J8.d
    public final void b(MainActivity mainActivity) {
        this.f30258a = mainActivity;
    }

    @Override // J8.d
    public final void c(MainActivity mainActivity) {
        this.f30259b = mainActivity;
    }

    @Override // J8.d
    public final Context d() {
        MainActivity mainActivity = this.f30259b;
        if (mainActivity != null) {
            return mainActivity;
        }
        kotlin.jvm.internal.i.m("activityContext");
        throw null;
    }

    @Override // J8.d
    public final Activity e() {
        MainActivity mainActivity = this.f30259b;
        if (mainActivity != null) {
            return mainActivity;
        }
        kotlin.jvm.internal.i.m("activityContext");
        throw null;
    }

    @Override // J8.d
    public final Context getContext() {
        return this.f30258a;
    }
}
