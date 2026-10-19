package p050db;

import C.g;
import O3.d;
import Ya.a;
import Ya.n;
import kotlin.jvm.internal.i;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.C2730c;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.j;
import kotlinx.serialization.json.internal.p;
import kotlinx.serialization.json.internal.q;
import kotlinx.serialization.json.internal.w;
import kotlinx.serialization.json.internal.z;
import p062eb.b;
import p062eb.c;

/* JADX INFO: renamed from: db.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2184a implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0357a f34641d = new C0357a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f34642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f34643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f34644c = new j();

    /* JADX INFO: renamed from: db.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Json.kt */
    public static final class C0357a extends AbstractC2184a {
        public C0357a() {
            super(new f(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, false, ClassDiscriminatorMode.f43962c), c.f34885a);
        }
    }

    public AbstractC2184a(f fVar, b bVar) {
        this.f34642a = fVar;
        this.f34643b = bVar;
    }

    public final <T> T a(a<? extends T> deserializer, String string) {
        i.e(deserializer, "deserializer");
        i.e(string, "string");
        z zVarJ = d.j(this, string);
        T t8 = (T) new w(this, WriteMode.OBJ, zVarJ, deserializer.getDescriptor(), null).m(deserializer);
        if (zVarJ.e() == 10) {
            return t8;
        }
        z.n(zVarJ, "Expected EOF after parsing, but had " + zVarJ.f44038e.charAt(zVarJ.f44034a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(Ya.b serializer, Object obj) {
        char[] cArr;
        i.e(serializer, "serializer");
        q qVar = new q();
        C2730c c2730c = C2730c.f43978c;
        synchronized (c2730c) {
            kotlin.collections.i<char[]> iVar = c2730c.f43979a;
            cArr = null;
            char[] cArrRemoveLast = iVar.isEmpty() ? null : iVar.removeLast();
            if (cArrRemoveLast != null) {
                c2730c.f43980b -= cArrRemoveLast.length;
                cArr = cArrRemoveLast;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        qVar.f44000a = cArr;
        try {
            p.a(this, qVar, serializer, obj);
            return qVar.toString();
        } finally {
            qVar.b();
        }
    }

    public final g c() {
        return this.f34643b;
    }
}
