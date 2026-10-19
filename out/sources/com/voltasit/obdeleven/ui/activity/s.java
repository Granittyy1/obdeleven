package com.voltasit.obdeleven.ui.activity;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import java.util.Arrays;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.voltasit.obdeleven.a f33690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f33691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ApplicationLanguage f33692c;

    public s(com.voltasit.obdeleven.a aVar, MainActivity mainActivity, ApplicationLanguage applicationLanguage) {
        this.f33690a = aVar;
        this.f33691b = mainActivity;
        this.f33692c = applicationLanguage;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        ApplicationLanguage applicationLanguageValueOf = ApplicationLanguage.valueOf(this.f33690a.a("applicationLanguage", ""));
        MainActivity mainActivity = this.f33691b;
        J8.p pVarW = mainActivity.w();
        String displayName = applicationLanguageValueOf.f().getDisplayName();
        ApplicationLanguage applicationLanguage = this.f33692c;
        pVarW.e("MainActivity", String.format("language in settings: %s, current app language: %s", Arrays.copyOf(new Object[]{displayName, applicationLanguage.f().getDisplayName()}, 2)));
        if (applicationLanguage == applicationLanguageValueOf) {
            mainActivity.w().e("MainActivity", "Languages in settings and for app are the same");
            mainActivity.C();
            return null;
        }
        mainActivity.w().e("MainActivity", "Recreating app to change language");
        mainActivity.C();
        mainActivity.recreate();
        return null;
    }
}
