package androidx.compose.runtime.internal;

import A8.A;
import E.t;
import androidx.compose.runtime.AbstractC1099m0;
import androidx.compose.runtime.AbstractC1104p;
import androidx.compose.runtime.C1109s;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.S0;

/* JADX INFO: compiled from: PersistentCompositionLocalMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends E.d<AbstractC1104p<Object>, S0<Object>> implements InterfaceC1089h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f13053e = new d(t.f2956e, 0);

    /* JADX INFO: compiled from: PersistentCompositionLocalMap.kt */
    public static final class a extends E.f<AbstractC1104p<Object>, S0<Object>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d f13054h;

        public a(d dVar) {
            this.f2939b = dVar;
            this.f2940c = new A();
            this.f2941d = dVar.f2934b;
            this.f2944g = dVar.f2935c;
            this.f13054h = dVar;
        }

        @Override // E.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d a() {
            Object obj = this.f2941d;
            d dVar = this.f13054h;
            if (obj != dVar.f2934b) {
                this.f2940c = new A();
                dVar = new d(this.f2941d, this.f2944g);
            }
            this.f13054h = dVar;
            return dVar;
        }

        @Override // E.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC1104p) {
                return super.containsKey((AbstractC1104p) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof S0) {
                return super.containsValue((S0) obj);
            }
            return false;
        }

        @Override // E.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof AbstractC1104p) {
                return (S0) super.get((AbstractC1104p) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC1104p) ? obj2 : (S0) super.getOrDefault((AbstractC1104p) obj, (S0) obj2);
        }

        @Override // E.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof AbstractC1104p) {
                return (S0) super.remove((AbstractC1104p) obj);
            }
            return null;
        }
    }

    @Override // androidx.compose.runtime.r
    public final <T> T a(AbstractC1104p<T> abstractC1104p) {
        return (T) C1109s.a(this, abstractC1104p);
    }

    @Override // E.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1104p) {
            return super.containsKey((AbstractC1104p) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof S0) {
            return super.containsValue((S0) obj);
        }
        return false;
    }

    @Override // E.d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1104p) {
            return (S0) super.get((AbstractC1104p) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1104p) ? obj2 : (S0) super.getOrDefault((AbstractC1104p) obj, (S0) obj2);
    }

    @Override // androidx.compose.runtime.InterfaceC1089h0
    public final a i() {
        return new a(this);
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
    @Override // androidx.compose.runtime.InterfaceC1089h0
    public final d s(AbstractC1099m0 abstractC1099m0, S0 s10) {
        t.a aVarU = this.f2934b.u(abstractC1099m0.hashCode(), 0, abstractC1099m0, s10);
        return aVarU == null ? this : new d(aVarU.f2961a, this.f2935c + aVarU.f2962b);
    }
}
