package com.google.android.play.core.integrity;

import C4.b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p032c6.a;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public class StandardIntegrityException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f27713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f27716d;

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    /* JADX WARN: Illegal instructions before constructor call */
    public StandardIntegrityException(int i10, boolean z10, Exception exc) {
        String strD;
        Locale locale = Locale.ROOT;
        HashMap map = a.f22336a;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = a.f22337b;
            if (map2.containsKey(numValueOf)) {
                strD = b.d((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
            } else {
                strD = "";
            }
        } else {
            strD = "";
        }
        super(new Status(i10, "Standard Integrity API error (" + i10 + "): " + strD + ".", null, null));
        this.f27716d = new Object();
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f27713a = exc;
        this.f27714b = z10;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f27713a;
    }
}
