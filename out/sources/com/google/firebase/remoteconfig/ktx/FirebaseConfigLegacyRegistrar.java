package com.google.firebase.remoteconfig.ktx;

import B7.g;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.M1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p228s6.a;

/* JADX INFO: compiled from: Logging.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseConfigLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a<?>> getComponents() {
        return M1.k(g.a("fire-cfg-ktx", "21.6.3"));
    }
}
