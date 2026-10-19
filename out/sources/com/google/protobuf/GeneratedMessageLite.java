package com.google.protobuf;

import com.braze.support.BrazeLogger;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2059a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected d0 unknownFields = d0.f29137f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MethodToInvoke f29038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MethodToInvoke f29039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final MethodToInvoke f29040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final MethodToInvoke f29041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final MethodToInvoke f29042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final MethodToInvoke f29043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final MethodToInvoke f29044h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ MethodToInvoke[] f29045i;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            f29038b = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            f29039c = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            f29040d = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            f29041e = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            f29042f = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            f29043g = methodToInvoke6;
            MethodToInvoke methodToInvoke7 = new MethodToInvoke("GET_PARSER", 6);
            f29044h = methodToInvoke7;
            f29045i = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, methodToInvoke7};
        }

        public MethodToInvoke() {
            throw null;
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) f29045i.clone();
        }
    }

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2059a.AbstractC0291a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MessageType f29046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MessageType f29047c;

        public a(MessageType messagetype) {
            this.f29046b = messagetype;
            if (messagetype.B()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f29047c = (MessageType) messagetype.E();
        }

        public static <MessageType> void t(MessageType messagetype, MessageType messagetype2) {
            U u10 = U.f29087c;
            u10.getClass();
            u10.a(messagetype.getClass()).a(messagetype, messagetype2);
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.f29046b.w(MethodToInvoke.f29042f);
            aVar.f29047c = (MessageType) q();
            return aVar;
        }

        @Override // com.google.protobuf.K
        public final boolean d() {
            return GeneratedMessageLite.A(this.f29047c, false);
        }

        public final MessageType p() {
            MessageType messagetype = (MessageType) q();
            messagetype.getClass();
            if (GeneratedMessageLite.A(messagetype, true)) {
                return messagetype;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType q() {
            if (!this.f29047c.B()) {
                return this.f29047c;
            }
            MessageType messagetype = this.f29047c;
            messagetype.getClass();
            U u10 = U.f29087c;
            u10.getClass();
            u10.a(messagetype.getClass()).b(messagetype);
            messagetype.C();
            return this.f29047c;
        }

        public final void r() {
            if (this.f29047c.B()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f29046b.E();
            t(messagetype, this.f29047c);
            this.f29047c = messagetype;
        }

        public final void s(GeneratedMessageLite generatedMessageLite) {
            if (this.f29046b.equals(generatedMessageLite)) {
                return;
            }
            r();
            t(this.f29047c, generatedMessageLite);
        }
    }

    public static class b<T extends GeneratedMessageLite<T, ?>> extends AbstractC2060b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f29048b;

        public b(T t8) {
            this.f29048b = t8;
        }

        public final GeneratedMessageLite d(AbstractC2066h abstractC2066h, C2071m c2071m) throws InvalidProtocolBufferException {
            GeneratedMessageLite generatedMessageLiteE = this.f29048b.E();
            try {
                U u10 = U.f29087c;
                u10.getClass();
                X xA = u10.a(generatedMessageLiteE.getClass());
                C2067i c2067i = abstractC2066h.f29161d;
                if (c2067i == null) {
                    c2067i = new C2067i(abstractC2066h);
                }
                xA.e(generatedMessageLiteE, c2067i, c2071m);
                xA.b(generatedMessageLiteE);
                return generatedMessageLiteE;
            } catch (InvalidProtocolBufferException e10) {
                e = e10;
                if (e.a()) {
                    e = new InvalidProtocolBufferException(e);
                }
                e.g(generatedMessageLiteE);
                throw e;
            } catch (UninitializedMessageException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.g(generatedMessageLiteE);
                throw invalidProtocolBufferException;
            } catch (IOException e12) {
                if (e12.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e12.getCause());
                }
                InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e12);
                invalidProtocolBufferException2.g(generatedMessageLiteE);
                throw invalidProtocolBufferException2;
            } catch (RuntimeException e13) {
                if (e13.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e13.getCause());
                }
                throw e13;
            }
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements K {
        protected C2075q<d> extensions = C2075q.f29190d;
    }

    public static final class d implements C2075q.a<d> {
        @Override // com.google.protobuf.C2075q.a
        public final WireFormat$JavaType A() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }
    }

    public static class e<ContainingType extends J, Type> extends AbstractC2064f {
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean A(T t8, boolean z10) {
        byte bByteValue = ((Byte) t8.w(MethodToInvoke.f29038b)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        U u10 = U.f29087c;
        u10.getClass();
        boolean zC = u10.a(t8.getClass()).c(t8);
        if (z10) {
            t8.w(MethodToInvoke.f29039c);
        }
        return zC;
    }

    public static <E> C2078u.d<E> D(C2078u.d<E> dVar) {
        int size = dVar.size();
        return dVar.h(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<?, ?>> void F(Class<T> cls, T t8) {
        t8.C();
        defaultInstanceMap.put(cls, t8);
    }

    public static <T extends GeneratedMessageLite<?, ?>> T x(Class<T> cls) {
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
            generatedMessageLite = (T) ((GeneratedMessageLite) g0.b(cls)).w(MethodToInvoke.f29043g);
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object z(Method method, J j, Object... objArr) {
        try {
            return method.invoke(j, objArr);
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

    public final boolean B() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void C() {
        this.memoizedSerializedSize &= BrazeLogger.SUPPRESS;
    }

    public final MessageType E() {
        return (MessageType) w(MethodToInvoke.f29041e);
    }

    @Override // com.google.protobuf.K
    public final GeneratedMessageLite a() {
        return (GeneratedMessageLite) w(MethodToInvoke.f29043g);
    }

    @Override // com.google.protobuf.J
    public final int c() {
        return q(null);
    }

    @Override // com.google.protobuf.K
    public final boolean d() {
        return A(this, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        U u10 = U.f29087c;
        u10.getClass();
        return u10.a(getClass()).h(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.J
    public final void g(CodedOutputStream codedOutputStream) throws IOException {
        U u10 = U.f29087c;
        u10.getClass();
        X xA = u10.a(getClass());
        C2068j c2068j = codedOutputStream.f29014a;
        if (c2068j == null) {
            c2068j = new C2068j(codedOutputStream);
        }
        xA.f(this, c2068j);
    }

    public final int hashCode() {
        if (B()) {
            U u10 = U.f29087c;
            u10.getClass();
            return u10.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            U u11 = U.f29087c;
            u11.getClass();
            this.memoizedHashCode = u11.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.J
    public final a o() {
        return (a) w(MethodToInvoke.f29042f);
    }

    @Override // com.google.protobuf.AbstractC2059a
    public final int p() {
        return this.memoizedSerializedSize & BrazeLogger.SUPPRESS;
    }

    @Override // com.google.protobuf.AbstractC2059a
    public final int q(X x10) {
        int i10;
        int i11;
        if (B()) {
            if (x10 == null) {
                U u10 = U.f29087c;
                u10.getClass();
                i11 = u10.a(getClass()).i(this);
            } else {
                i11 = x10.i(this);
            }
            if (i11 >= 0) {
                return i11;
            }
            throw new IllegalStateException(J4.i.b(i11, "serialized size must be non-negative, was "));
        }
        if (p() != Integer.MAX_VALUE) {
            return p();
        }
        if (x10 == null) {
            U u11 = U.f29087c;
            u11.getClass();
            i10 = u11.a(getClass()).i(this);
        } else {
            i10 = x10.i(this);
        }
        s(i10);
        return i10;
    }

    @Override // com.google.protobuf.AbstractC2059a
    public final void s(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(J4.i.b(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & BrazeLogger.SUPPRESS) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final void t() {
        this.memoizedHashCode = 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L.f29059a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        L.c(this, sb2, 0);
        return sb2.toString();
    }

    public final void u() {
        s(BrazeLogger.SUPPRESS);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType v() {
        return (BuilderType) w(MethodToInvoke.f29042f);
    }

    public abstract Object w(MethodToInvoke methodToInvoke);

    public final S<MessageType> y() {
        return (S) w(MethodToInvoke.f29044h);
    }
}
