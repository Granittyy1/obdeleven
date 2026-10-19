package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.collection.C0873a;
import com.google.common.base.Optional;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1817g2 implements com.google.common.base.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Context f25713b;

    @Override // com.google.common.base.j
    public final Object get() {
        Optional<InterfaceC1789c2> optionalB;
        Context contextCreateDeviceProtectedStorageContext = this.f25713b;
        Optional<InterfaceC1789c2> optional = C1782b2.a.f25662a;
        if (optional == null) {
            synchronized (C1782b2.a.class) {
                try {
                    optional = C1782b2.a.f25662a;
                    if (optional == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        C0873a<String, Uri> c0873a = C1810f2.f25703a;
                        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                            if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                            }
                            optionalB = C1782b2.b(contextCreateDeviceProtectedStorageContext);
                        } else {
                            optionalB = Optional.a();
                        }
                        C1782b2.a.f25662a = optionalB;
                        optional = optionalB;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return optional;
    }
}
