package p050db;

import Ia.l;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import p011ab.d;
import p011ab.e;
import p011ab.m;
import p011ab.n;
import p062eb.a;
import p062eb.b;
import p062eb.c;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static r a(l builderAction) {
        AbstractC2184a.C0357a from = AbstractC2184a.f34641d;
        i.e(from, "from");
        i.e(builderAction, "builderAction");
        d dVar = new d();
        f fVar = from.f34642a;
        dVar.f34651a = fVar.f34667a;
        dVar.f34652b = fVar.f34672f;
        dVar.f34653c = fVar.f34668b;
        dVar.f34654d = fVar.f34669c;
        boolean z10 = fVar.f34671e;
        dVar.f34655e = z10;
        String str = fVar.f34673g;
        dVar.f34656f = str;
        dVar.f34657g = fVar.f34674h;
        String str2 = fVar.j;
        dVar.f34658h = str2;
        ClassDiscriminatorMode classDiscriminatorMode = fVar.f34681p;
        dVar.f34659i = classDiscriminatorMode;
        dVar.j = fVar.f34677l;
        dVar.f34660k = fVar.f34678m;
        dVar.f34661l = fVar.f34679n;
        dVar.f34662m = fVar.f34680o;
        dVar.f34663n = fVar.f34676k;
        dVar.f34664o = fVar.f34670d;
        dVar.f34665p = fVar.f34675i;
        dVar.f34666q = from.f34643b;
        builderAction.invoke(dVar);
        if (dVar.f34665p) {
            if (!i.a(str2, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (classDiscriminatorMode != ClassDiscriminatorMode.f43962c) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (z10) {
            if (!i.a(str, "    ")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!i.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z11 = dVar.f34651a;
        boolean z12 = dVar.f34653c;
        boolean z13 = dVar.f34654d;
        boolean z14 = dVar.f34665p;
        boolean z15 = dVar.f34663n;
        boolean z16 = dVar.f34662m;
        ClassDiscriminatorMode classDiscriminatorMode2 = dVar.f34659i;
        boolean z17 = dVar.f34664o;
        boolean z18 = dVar.f34655e;
        boolean z19 = dVar.f34652b;
        String str3 = dVar.f34656f;
        boolean z20 = dVar.f34657g;
        String str4 = dVar.f34658h;
        f fVar2 = new f(z11, z12, z13, z17, z18, z19, str3, z20, z14, str4, z15, dVar.j, dVar.f34660k, dVar.f34661l, z16, classDiscriminatorMode2);
        b module = dVar.f34666q;
        i.e(module, "module");
        r rVar = new r(fVar2, module);
        if (!module.equals(c.f34885a)) {
            for (Map.Entry<Oa.c<?>, a> entry : module.f34880c.entrySet()) {
                Oa.c<?> kClass = entry.getKey();
                a value = entry.getValue();
                if (value instanceof a.C0361a) {
                    i.c(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    ((a.C0361a) value).getClass();
                    i.c(null, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    i.e(null, "serializer");
                } else {
                    if (!(value instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((a.b) value).getClass();
                    i.e(kClass, "kClass");
                    i.e(null, "provider");
                }
            }
            for (Map.Entry<Oa.c<?>, Map<Oa.c<?>, Ya.b<?>>> entry2 : module.f34881d.entrySet()) {
                Oa.c<?> key = entry2.getKey();
                for (Map.Entry<Oa.c<?>, Ya.b<?>> entry3 : entry2.getValue().entrySet()) {
                    Oa.c<?> key2 = entry3.getKey();
                    Ya.b<?> value2 = entry3.getValue();
                    i.c(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    i.c(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    i.c(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    e descriptor = value2.getDescriptor();
                    m mVarE = descriptor.e();
                    if ((mVarE instanceof p011ab.c) || i.a(mVarE, m.a.f8122a)) {
                        throw new IllegalArgumentException("Serializer for " + key2.a() + " can't be registered as a subclass for polymorphic serialization because its kind " + mVarE + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    if (!z14 && (i.a(mVarE, n.b.f8125a) || i.a(mVarE, n.c.f8126a) || (mVarE instanceof d) || (mVarE instanceof m.b))) {
                        throw new IllegalArgumentException("Serializer for " + key2.a() + " of kind " + mVarE + " cannot be serialized polymorphically with class discriminator.");
                    }
                    if (!z14) {
                        int iF = descriptor.f();
                        for (int i11 = 0; i11 < iF; i11++) {
                            String strG = descriptor.g(i11);
                            if (i.a(strG, str4)) {
                                throw new IllegalArgumentException("Polymorphic serializer for " + key2 + " has property '" + strG + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            }
                        }
                    }
                }
            }
            for (Map.Entry<Oa.c<?>, l<?, Ya.l<?>>> entry4 : module.f34882e.entrySet()) {
                Oa.c<?> key3 = entry4.getKey();
                l<?, Ya.l<?>> value3 = entry4.getValue();
                i.c(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                i.c(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                o.d(1, value3);
            }
            for (Map.Entry<Oa.c<?>, l<String, Ya.a<?>>> entry5 : module.f34884g.entrySet()) {
                Oa.c<?> key4 = entry5.getKey();
                l<String, Ya.a<?>> value4 = entry5.getValue();
                i.c(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                i.c(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                o.d(1, value4);
            }
        }
        return rVar;
    }
}
