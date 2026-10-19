package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.j;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.C1330u;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: PreferencesSerializer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f17088a = new e();

    /* JADX INFO: compiled from: PreferencesSerializer.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17089a;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f17089a = iArr;
        }
    }

    public final MutablePreferences a(FileInputStream fileInputStream) throws IOException {
        try {
            androidx.datastore.preferences.c cVarS = androidx.datastore.preferences.c.s(fileInputStream);
            MutablePreferences mutablePreferences = new MutablePreferences(1, false);
            c.b[] pairs = (c.b[]) Arrays.copyOf(new c.b[0], 0);
            i.e(pairs, "pairs");
            if (mutablePreferences.f17084b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (pairs.length > 0) {
                pairs[0].getClass();
                mutablePreferences.c(null, null);
                throw null;
            }
            Map<String, PreferencesProto$Value> mapQ = cVarS.q();
            i.d(mapQ, "preferencesProto.preferencesMap");
            for (Map.Entry<String, PreferencesProto$Value> entry : mapQ.entrySet()) {
                String name = entry.getKey();
                PreferencesProto$Value value = entry.getValue();
                i.d(name, "name");
                i.d(value, "value");
                PreferencesProto$Value.ValueCase valueCaseE = value.E();
                switch (valueCaseE == null ? -1 : a.f17089a[valueCaseE.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        mutablePreferences.c(new c.a<>(name), Boolean.valueOf(value.w()));
                        break;
                    case 2:
                        mutablePreferences.c(new c.a<>(name), Float.valueOf(value.z()));
                        break;
                    case 3:
                        mutablePreferences.c(new c.a<>(name), Double.valueOf(value.y()));
                        break;
                    case 4:
                        mutablePreferences.c(new c.a<>(name), Integer.valueOf(value.A()));
                        break;
                    case 5:
                        mutablePreferences.c(new c.a<>(name), Long.valueOf(value.B()));
                        break;
                    case 6:
                        c.a<?> aVar = new c.a<>(name);
                        String strC = value.C();
                        i.d(strC, "value.string");
                        mutablePreferences.c(aVar, strC);
                        break;
                    case 7:
                        c.a<?> aVar2 = new c.a<>(name);
                        C1330u.c cVarR = value.D().r();
                        i.d(cVarR, "value.stringSet.stringsList");
                        mutablePreferences.c(aVar2, q.s0(cVarR));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new MutablePreferences((Map<c.a<?>, Object>) y.y(mutablePreferences.a()), true);
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException("Unable to parse preferences proto.", e10);
        }
    }

    public final r b(Object obj, j.b bVar) throws IOException {
        PreferencesProto$Value preferencesProto$ValueG;
        Map<c.a<?>, Object> mapA = ((c) obj).a();
        androidx.datastore.preferences.c.a aVarR = androidx.datastore.preferences.c.r();
        for (Map.Entry<c.a<?>, Object> entry : mapA.entrySet()) {
            c.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f17087a;
            if (value instanceof Boolean) {
                PreferencesProto$Value.a aVarF = PreferencesProto$Value.F();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarF.i();
                PreferencesProto$Value.t((PreferencesProto$Value) aVarF.f17130c, zBooleanValue);
                preferencesProto$ValueG = aVarF.g();
            } else if (value instanceof Float) {
                PreferencesProto$Value.a aVarF2 = PreferencesProto$Value.F();
                float fFloatValue = ((Number) value).floatValue();
                aVarF2.i();
                PreferencesProto$Value.u((PreferencesProto$Value) aVarF2.f17130c, fFloatValue);
                preferencesProto$ValueG = aVarF2.g();
            } else if (value instanceof Double) {
                PreferencesProto$Value.a aVarF3 = PreferencesProto$Value.F();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarF3.i();
                PreferencesProto$Value.r((PreferencesProto$Value) aVarF3.f17130c, dDoubleValue);
                preferencesProto$ValueG = aVarF3.g();
            } else if (value instanceof Integer) {
                PreferencesProto$Value.a aVarF4 = PreferencesProto$Value.F();
                int iIntValue = ((Number) value).intValue();
                aVarF4.i();
                PreferencesProto$Value.v((PreferencesProto$Value) aVarF4.f17130c, iIntValue);
                preferencesProto$ValueG = aVarF4.g();
            } else if (value instanceof Long) {
                PreferencesProto$Value.a aVarF5 = PreferencesProto$Value.F();
                long jLongValue = ((Number) value).longValue();
                aVarF5.i();
                PreferencesProto$Value.o((PreferencesProto$Value) aVarF5.f17130c, jLongValue);
                preferencesProto$ValueG = aVarF5.g();
            } else if (value instanceof String) {
                PreferencesProto$Value.a aVarF6 = PreferencesProto$Value.F();
                aVarF6.i();
                PreferencesProto$Value.p((PreferencesProto$Value) aVarF6.f17130c, (String) value);
                preferencesProto$ValueG = aVarF6.g();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(i.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                PreferencesProto$Value.a aVarF7 = PreferencesProto$Value.F();
                androidx.datastore.preferences.d.a aVarS = androidx.datastore.preferences.d.s();
                aVarS.i();
                androidx.datastore.preferences.d.p((androidx.datastore.preferences.d) aVarS.f17130c, (Set) value);
                aVarF7.i();
                PreferencesProto$Value.q((PreferencesProto$Value) aVarF7.f17130c, aVarS);
                preferencesProto$ValueG = aVarF7.g();
            }
            aVarR.getClass();
            aVarR.i();
            androidx.datastore.preferences.c.p((androidx.datastore.preferences.c) aVarR.f17130c).put(str, preferencesProto$ValueG);
        }
        androidx.datastore.preferences.c cVarG = aVarR.g();
        int iC = cVarG.c();
        Logger logger = CodedOutputStream.f17101b;
        if (iC > 4096) {
            iC = 4096;
        }
        CodedOutputStream.c cVar = new CodedOutputStream.c(bVar, iC);
        cVarG.e(cVar);
        if (cVar.f17106f > 0) {
            cVar.b0();
        }
        return r.f47939a;
    }
}
