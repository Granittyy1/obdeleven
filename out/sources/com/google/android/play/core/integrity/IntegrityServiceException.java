package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f27709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f27712d;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f27709a;
    }
}
