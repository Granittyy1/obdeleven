package kotlin.jvm.internal;

import java.util.List;
import kotlin.collections.q;
import p005a4.p;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeReference implements Oa.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f43052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Oa.o> f43053c;

    public TypeReference() {
        throw null;
    }

    public TypeReference(c cVar, List arguments) {
        i.e(arguments, "arguments");
        this.f43052b = cVar;
        this.f43053c = arguments;
    }

    @Override // Oa.m
    public final List<Oa.o> d() {
        return this.f43053c;
    }

    @Override // Oa.m
    public final Oa.d e() {
        return this.f43052b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeReference) {
            TypeReference typeReference = (TypeReference) obj;
            if (i.a(this.f43052b, typeReference.f43052b) && i.a(this.f43053c, typeReference.f43053c) && i.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + p.d(this.f43052b.hashCode() * 31, 31, this.f43053c);
    }

    public final String toString() {
        String name;
        StringBuilder sb2 = new StringBuilder();
        c cVar = this.f43052b;
        c cVar2 = cVar != null ? cVar : null;
        Class clsR = cVar2 != null ? p241t7.b.r(cVar2) : null;
        if (clsR == null) {
            name = cVar.toString();
        } else if (!clsR.isArray()) {
            name = clsR.getName();
        } else if (clsR.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsR.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsR.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsR.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsR.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsR.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsR.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsR.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List<Oa.o> list = this.f43053c;
        sb2.append(O.a.f(name, list.isEmpty() ? "" : q.U(list, ", ", "<", ">", new Ia.l<Oa.o, CharSequence>() { // from class: kotlin.jvm.internal.TypeReference$asString$args$1
            {
                super(1);
            }

            @Override // Ia.l
            public final CharSequence invoke(Oa.o oVar) {
                Oa.o it = oVar;
                i.e(it, "it");
                this.this$0.getClass();
                return "*";
            }
        }, 24), ""));
        sb2.append(" (Kotlin reflection is not available)");
        return sb2.toString();
    }
}
