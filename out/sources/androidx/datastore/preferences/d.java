package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C1330u;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InterfaceC1334y;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PreferencesProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends GeneratedMessageLite<d, a> implements J {
    private static final d DEFAULT_INSTANCE;
    private static volatile Q<d> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C1330u.c<String> strings_ = U.f17172e;

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class a extends GeneratedMessageLite.a<d, a> implements J {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.n(d.class, dVar);
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
    public static void p(d dVar, Iterable iterable) {
        if (!dVar.strings_.n()) {
            C1330u.c<String> cVar = dVar.strings_;
            int size = cVar.size();
            dVar.strings_ = cVar.h(size == 0 ? 10 : size * 2);
        }
        List list = dVar.strings_;
        Charset charset = C1330u.f17280a;
        iterable.getClass();
        if (iterable instanceof InterfaceC1334y) {
            List<?> listJ = ((InterfaceC1334y) iterable).j();
            InterfaceC1334y interfaceC1334y = (InterfaceC1334y) list;
            int size2 = list.size();
            for (Object obj : listJ) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1334y.size() - size2) + " is null.";
                    for (int size3 = interfaceC1334y.size() - 1; size3 >= size2; size3--) {
                        interfaceC1334y.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    interfaceC1334y.D((ByteString) obj);
                } else {
                    interfaceC1334y.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof S) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static d q() {
        return DEFAULT_INSTANCE;
    }

    public static a s() {
        return (a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.j(GeneratedMessageLite.MethodToInvoke.f17126f));
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object j(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<d> bVar = PARSER;
                if (bVar == null) {
                    synchronized (d.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>();
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C1330u.c r() {
        return this.strings_;
    }
}
