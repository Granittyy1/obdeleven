package com.facebook;

import Z3.l;
import Z3.q;
import com.facebook.internal.FeatureManager;
import java.util.Random;

/* JADX INFO: compiled from: FacebookException.kt */
/* JADX INFO: loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24757b = 0;
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !q.f7866p.get() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager featureManager = FeatureManager.f24975a;
        FeatureManager.a(new l(str), FeatureManager.Feature.ErrorReport);
    }
}
