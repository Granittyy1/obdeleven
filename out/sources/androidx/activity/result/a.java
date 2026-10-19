package androidx.activity.result;

import android.os.Bundle;
import androidx.activity.result.a;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt__SequencesKt;
import p063f.e;
import p063f.f;
import p271w0.b;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8255a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8256b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8257c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8258d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f8259e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f8260f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f8261g = new Bundle();

    /* JADX INFO: renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class C0114a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p063f.b<O> f8262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p076g.a<?, O> f8263b;

        public C0114a(p076g.a contract, p063f.b callback) {
            i.e(callback, "callback");
            i.e(contract, "contract");
            this.f8262a = callback;
            this.f8263b = contract;
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f8264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f8265b = new ArrayList();

        public b(Lifecycle lifecycle) {
            this.f8264a = lifecycle;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.f8255a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.LinkedHashMap r0 = r3.f8259e
            java.lang.Object r0 = r0.get(r4)
            androidx.activity.result.a$a r0 = (androidx.activity.result.a.C0114a) r0
            if (r0 == 0) goto L1d
            f.b<O> r1 = r0.f8262a
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.f8258d
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            f.b<O> r2 = r0.f8262a
            g.a<?, O> r0 = r0.f8263b
            java.lang.Object r5 = r0.parseResult(r5, r6)
            r2.b(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f8260f
            r0.remove(r4)
            f.a r0 = new f.a
            r0.<init>(r5, r6)
            android.os.Bundle r5 = r3.f8261g
            r5.putParcelable(r4, r0)
        L46:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.a.a(int, int, android.content.Intent):boolean");
    }

    public abstract void b(int i10, p076g.a aVar, Object obj);

    public final e c(final String key, InterfaceC1376t lifecycleOwner, final p076g.a contract, final p063f.b callback) {
        i.e(key, "key");
        i.e(lifecycleOwner, "lifecycleOwner");
        i.e(contract, "contract");
        i.e(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().compareTo(Lifecycle.State.f17752e) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f8257c;
        b bVar = (b) linkedHashMap.get(key);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        r rVar = new r() { // from class: f.d
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                a aVar = this.f34888b;
                String str = key;
                if (event2 != event) {
                    if (Lifecycle.Event.ON_STOP == event) {
                        aVar.f8259e.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY == event) {
                            aVar.f(str);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = aVar.f8259e;
                b bVar2 = callback;
                p076g.a aVar2 = contract;
                linkedHashMap2.put(str, new a.C0114a(aVar2, bVar2));
                LinkedHashMap linkedHashMap3 = aVar.f8260f;
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar2.b(obj);
                }
                Bundle bundle = aVar.f8261g;
                a aVar3 = (a) b.a(bundle, str, a.class);
                if (aVar3 != null) {
                    bundle.remove(str);
                    bVar2.b(aVar2.parseResult(aVar3.f34886b, aVar3.f34887c));
                }
            }
        };
        bVar.f8264a.a(rVar);
        bVar.f8265b.add(rVar);
        linkedHashMap.put(key, bVar);
        return new e(this, key, contract);
    }

    public final f d(String key, p076g.a contract, p063f.b bVar) {
        i.e(key, "key");
        i.e(contract, "contract");
        e(key);
        this.f8259e.put(key, new C0114a(contract, bVar));
        LinkedHashMap linkedHashMap = this.f8260f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            bVar.b(obj);
        }
        Bundle bundle = this.f8261g;
        p063f.a aVar = (p063f.a) p271w0.b.a(bundle, key, p063f.a.class);
        if (aVar != null) {
            bundle.remove(key);
            bVar.b(contract.parseResult(aVar.f34886b, aVar.f34887c));
        }
        return new f(this, key, contract);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f8256b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (kotlin.sequences.a) SequencesKt__SequencesKt.y(new Ia.a<Integer>() { // from class: androidx.activity.result.ActivityResultRegistry$generateRandomNumber$1
            @Override // Ia.a
            public final Integer invoke() {
                Random.f43064b.getClass();
                return Integer.valueOf(Random.f43065c.c(2147418112) + 65536);
            }
        })) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f8255a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        i.e(key, "key");
        if (!this.f8258d.contains(key) && (num = (Integer) this.f8256b.remove(key)) != null) {
            this.f8255a.remove(num);
        }
        this.f8259e.remove(key);
        LinkedHashMap linkedHashMap = this.f8260f;
        if (linkedHashMap.containsKey(key)) {
            Objects.toString(linkedHashMap.get(key));
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f8261g;
        if (bundle.containsKey(key)) {
            Objects.toString((p063f.a) p271w0.b.a(bundle, key, p063f.a.class));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f8257c;
        b bVar = (b) linkedHashMap2.get(key);
        if (bVar != null) {
            ArrayList arrayList = bVar.f8265b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f8264a.c((r) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
