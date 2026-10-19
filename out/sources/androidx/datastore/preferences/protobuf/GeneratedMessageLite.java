package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1311a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected d0 unknownFields = d0.f17217f;
    protected int memoizedSerializedSize = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MethodToInvoke f17122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MethodToInvoke f17123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final MethodToInvoke f17124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final MethodToInvoke f17125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final MethodToInvoke f17126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final MethodToInvoke f17127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ MethodToInvoke[] f17128h;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            f17122b = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            f17123c = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            f17124d = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            f17125e = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            f17126f = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            f17127g = methodToInvoke6;
            f17128h = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, new MethodToInvoke("GET_PARSER", 6)};
        }

        public MethodToInvoke() {
            throw null;
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) f17128h.clone();
        }
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1311a.AbstractC0178a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MessageType f17129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MessageType f17130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17131d = false;

        public a(MessageType messagetype) {
            this.f17129b = messagetype;
            this.f17130c = (MessageType) messagetype.j(MethodToInvoke.f17125e);
        }

        public static void j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            T t8 = T.f17169c;
            t8.getClass();
            t8.a(generatedMessageLite.getClass()).g(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.f17129b.j(MethodToInvoke.f17126f);
            GeneratedMessageLite generatedMessageLiteH = h();
            aVar.i();
            j(aVar.f17130c, generatedMessageLiteH);
            return aVar;
        }

        public final MessageType g() {
            MessageType messagetype = (MessageType) h();
            if (messagetype.m()) {
                return messagetype;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType h() {
            if (this.f17131d) {
                return this.f17130c;
            }
            MessageType messagetype = this.f17130c;
            messagetype.getClass();
            T t8 = T.f17169c;
            t8.getClass();
            t8.a(messagetype.getClass()).b(messagetype);
            this.f17131d = true;
            return this.f17130c;
        }

        public final void i() {
            if (this.f17131d) {
                MessageType messagetype = (MessageType) this.f17130c.j(MethodToInvoke.f17125e);
                j(messagetype, this.f17130c);
                this.f17130c = messagetype;
                this.f17131d = false;
            }
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends AbstractC1312b<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements J {
        protected C1327q<d> extensions = C1327q.f17271d;

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.J
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) j(MethodToInvoke.f17127g);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.I
        public final a d() {
            a aVar = (a) j(MethodToInvoke.f17126f);
            aVar.i();
            a.j(aVar.f17130c, this);
            return aVar;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.I
        public final a f() {
            return (a) j(MethodToInvoke.f17126f);
        }
    }

    public static final class d implements C1327q.a<d> {
        @Override // androidx.datastore.preferences.protobuf.C1327q.a
        public final WireFormat$JavaType A() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }
    }

    public static class e<ContainingType extends I, Type> extends AbstractC1316f {
    }

    public static <T extends GeneratedMessageLite<?, ?>> T k(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) g0.a(cls)).j(MethodToInvoke.f17127g);
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object l(Method method, I i10, Object... objArr) {
        try {
            return method.invoke(i10, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void n(Class<T> cls, T t8) {
        defaultInstanceMap.put(cls, t8);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) j(MethodToInvoke.f17127g);
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public final int c() {
        if (this.memoizedSerializedSize == -1) {
            T t8 = T.f17169c;
            t8.getClass();
            this.memoizedSerializedSize = t8.a(getClass()).f(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public a d() {
        a aVar = (a) j(MethodToInvoke.f17126f);
        aVar.i();
        a.j(aVar.f17130c, this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public final void e(CodedOutputStream codedOutputStream) throws IOException {
        T t8 = T.f17169c;
        t8.getClass();
        X xA = t8.a(getClass());
        C1320j c1320j = codedOutputStream.f17103a;
        if (c1320j == null) {
            c1320j = new C1320j(codedOutputStream);
        }
        xA.i(this, c1320j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) j(MethodToInvoke.f17127g)).getClass().isInstance(obj)) {
            return false;
        }
        T t8 = T.f17169c;
        t8.getClass();
        return t8.a(getClass()).j(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public a f() {
        return (a) j(MethodToInvoke.f17126f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1311a
    public final int g() {
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        T t8 = T.f17169c;
        t8.getClass();
        int iH = t8.a(getClass()).h(this);
        this.memoizedHashCode = iH;
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1311a
    public final void i(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public abstract Object j(MethodToInvoke methodToInvoke);

    public final boolean m() {
        byte bByteValue = ((Byte) j(MethodToInvoke.f17122b)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        T t8 = T.f17169c;
        t8.getClass();
        boolean zC = t8.a(getClass()).c(this);
        j(MethodToInvoke.f17123c);
        return zC;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        K.c(this, sb2, 0);
        return sb2.toString();
    }
}
