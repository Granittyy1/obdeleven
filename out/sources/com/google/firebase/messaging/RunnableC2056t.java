package com.google.firebase.messaging;

import androidx.media3.exoplayer.C1390h;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import p114j1.C2480b;

/* JADX INFO: renamed from: com.google.firebase.messaging.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2056t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28413d;

    public /* synthetic */ RunnableC2056t(Object obj, int i10, Object obj2) {
        this.f28411b = i10;
        this.f28412c = obj;
        this.f28413d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        p096h7.a.InterfaceC0377a<T> interfaceC0377a;
        switch (this.f28411b) {
            case 0:
                ((FirebaseMessaging) this.f28412c).lambda$deleteToken$8((p191p5.h) this.f28413d);
                return;
            case 1:
                SettingsFragment this$0 = (SettingsFragment) this.f28412c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.r().n((com.voltasit.obdeleven.ui.module.b) this.f28413d, null);
                return;
            case 2:
                C2480b c2480b = (C2480b) this.f28412c;
                c2480b.getClass();
                ?? r10 = this.f28413d;
                T t8 = c2480b.f41009d;
                c2480b.f41009d = r10;
                if (t8.equals(r10)) {
                    return;
                }
                c2480b.f41008c.c(t8, r10);
                return;
            case 3:
                p175o1.j jVar = (p175o1.j) this.f28412c;
                jVar.getClass();
                int i10 = p114j1.A.f40996a;
                androidx.media3.exoplayer.K k10 = androidx.media3.exoplayer.K.this;
                k10.getClass();
                k10.f18039s.E((C1390h) this.f28413d);
                return;
            case 4:
                p228s6.o oVar = (p228s6.o) this.f28412c;
                p096h7.b<T> bVar = (p096h7.b) this.f28413d;
                if (oVar.f46976b != p228s6.o.f46974d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    interfaceC0377a = oVar.f46975a;
                    oVar.f46975a = null;
                    oVar.f46976b = bVar;
                    break;
                }
                interfaceC0377a.d(bVar);
                return;
            default:
                y7.e eVar = (y7.e) this.f28412c;
                com.google.firebase.perf.v1.b bVarB = eVar.b((com.google.firebase.perf.util.h) this.f28413d);
                if (bVarB != null) {
                    eVar.f48423b.add(bVarB);
                    return;
                }
                return;
        }
    }
}
