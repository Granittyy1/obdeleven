package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC1318h;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C1319i;
import androidx.datastore.preferences.protobuf.C1323m;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.datastore.preferences.protobuf.X;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: PreferencesProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends GeneratedMessageLite<c, a> implements J {
    private static final c DEFAULT_INSTANCE;
    private static volatile Q<c> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.f17163b;

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class a extends GeneratedMessageLite.a<c, a> implements J {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: PreferencesProto.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C<String, PreferencesProto$Value> f17082a = new C<>(WireFormat$FieldType.f17180b, WireFormat$FieldType.f17182d, PreferencesProto$Value.x());
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.n(c.class, cVar);
    }

    public static MapFieldLite p(c cVar) {
        if (!cVar.preferences_.c()) {
            cVar.preferences_ = cVar.preferences_.f();
        }
        return cVar.preferences_;
    }

    public static a r() {
        return (a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.j(GeneratedMessageLite.MethodToInvoke.f17126f));
    }

    public static c s(FileInputStream fileInputStream) throws IOException {
        c cVar = DEFAULT_INSTANCE;
        AbstractC1318h.b bVar = new AbstractC1318h.b(fileInputStream);
        C1323m c1323mA = C1323m.a();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) cVar.j(GeneratedMessageLite.MethodToInvoke.f17125e);
        try {
            T t8 = T.f17169c;
            t8.getClass();
            X xA = t8.a(generatedMessageLite.getClass());
            C1319i c1319i = bVar.f17242d;
            if (c1319i == null) {
                c1319i = new C1319i(bVar);
            }
            xA.e(generatedMessageLite, c1319i, c1323mA);
            xA.b(generatedMessageLite);
            if (generatedMessageLite.m()) {
                return (c) generatedMessageLite;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f(generatedMessageLite);
            throw invalidProtocolBufferException;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e10.getMessage());
            invalidProtocolBufferException2.f(generatedMessageLite);
            throw invalidProtocolBufferException2;
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object j(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f17082a});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<c> bVar = PARSER;
                if (bVar == null) {
                    synchronized (c.class) {
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

    public final Map<String, PreferencesProto$Value> q() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
