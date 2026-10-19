package androidx.navigation.compose;

import androidx.compose.runtime.X;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;
import java.util.ArrayList;
import java.util.List;
import p141l2.C2749t;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19129c;

    public /* synthetic */ K(int i10, Object obj) {
        this.f19128b = i10;
        this.f19129c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        switch (this.f19128b) {
            case 0:
                List list = (List) ((X) this.f19129c).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.i.a(((C2749t) obj).f44299c.f44218b, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return AppIdentityInjector.messengerApi_delegate$lambda$13((AppIdentityInjector) this.f19129c);
            default:
                return ListAttributeCollectorKt.ListAttributeCollector$lambda$4((AttributeData) this.f19129c);
        }
    }
}
