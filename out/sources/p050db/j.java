package p050db;

import Ia.l;
import android.app.Activity;
import android.content.Context;
import io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt;
import kotlin.jvm.internal.i;
import p011ab.a;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34683b;

    public /* synthetic */ j(int i10) {
        this.f34683b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f34683b) {
            case 0:
                a buildSerialDescriptor = (a) obj;
                i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                a.b(buildSerialDescriptor, "JsonPrimitive", new p(new k(0)));
                a.b(buildSerialDescriptor, "JsonNull", new p(new l()));
                a.b(buildSerialDescriptor, "JsonLiteral", new p(new O9.a(1)));
                a.b(buildSerialDescriptor, "JsonObject", new p(new m(0)));
                a.b(buildSerialDescriptor, "JsonArray", new p(new n(0)));
                return r.f47939a;
            case 1:
                return HomeContentScreenKt.HomeContentScreen$lambda$3((String) obj);
            default:
                Context it = (Context) obj;
                i.e(it, "it");
                if (it instanceof Activity) {
                    return (Activity) it;
                }
                return null;
        }
    }
}
