package com.obdeleven.service.model;

import O.h;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC2670b;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: IntelHexRecord.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntelHexRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Byte> f29369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecordType f29370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29371d;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.obdeleven.service.model.IntelHexRecord$RecordType[], still in use, count: 1, list:
      (r0v1 com.obdeleven.service.model.IntelHexRecord$RecordType[]) from 0x003a: INVOKE (r0v1 com.obdeleven.service.model.IntelHexRecord$RecordType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:59)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: IntelHexRecord.kt */
    public static final class RecordType {
        Data((byte) 0),
        /* JADX INFO: Fake field, exist only in values array */
        EndOfFile((byte) 1),
        /* JADX INFO: Fake field, exist only in values array */
        ExtendedSegmentAddress((byte) 2),
        /* JADX INFO: Fake field, exist only in values array */
        StartSegmentAddress((byte) 3),
        ExtendedLinearAddress((byte) 4),
        /* JADX INFO: Fake field, exist only in values array */
        StartLinearAddress((byte) 5);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f29372b = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Ba.a f29376f;
        private final byte code;

        /* JADX INFO: compiled from: IntelHexRecord.kt */
        public static final class a {
        }

        static {
            f29376f = kotlin.enums.a.a(new RecordType[]{r0, r1, r2, r3, r4, new RecordType((byte) 5)});
        }

        public RecordType(byte b10) {
            super(str, i);
            this.code = b10;
        }

        public static RecordType valueOf(String str) {
            return (RecordType) Enum.valueOf(RecordType.class, str);
        }

        public static RecordType[] values() {
            return (RecordType[]) f29375e.clone();
        }

        public final byte a() {
            return this.code;
        }
    }

    public IntelHexRecord() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List<java.lang.Byte>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public IntelHexRecord(String record) {
        ?? data;
        i.e(record, "record");
        String strSubstring = record.substring(3, 7);
        i.d(strSubstring, "substring(...)");
        int iH = E8.a.h(kotlin.text.c.d(strSubstring));
        String strSubstring2 = record.substring(1, 3);
        i.d(strSubstring2, "substring(...)");
        h.c(16);
        String strSubstring3 = record.substring(9, (Integer.parseInt(strSubstring2, 16) * 2) + 9);
        i.d(strSubstring3, "substring(...)");
        byte[] bArrD = kotlin.text.c.d(strSubstring3);
        int length = bArrD.length;
        if (length != 0) {
            if (length != 1) {
                data = new ArrayList(bArrD.length);
                for (byte b10 : bArrD) {
                    data.add(Byte.valueOf(b10));
                }
            } else {
                data = M1.k(Byte.valueOf(bArrD[0]));
            }
        } else {
            data = EmptyList.f42983b;
        }
        RecordType.a aVar = RecordType.f29372b;
        String strSubstring4 = record.substring(7, 9);
        i.d(strSubstring4, "substring(...)");
        h.c(16);
        byte b11 = Byte.parseByte(strSubstring4, 16);
        aVar.getClass();
        for (RecordType recordType : (AbstractC2670b) RecordType.f29376f) {
            if (recordType.a() == b11) {
                String strSubstring5 = record.substring(record.length() - 2, record.length());
                i.d(strSubstring5, "substring(...)");
                int iH2 = E8.a.h(kotlin.text.c.d(strSubstring5));
                i.e(data, "data");
                this.f29368a = iH;
                this.f29369b = data;
                this.f29370c = recordType;
                this.f29371d = iH2;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntelHexRecord)) {
            return false;
        }
        IntelHexRecord intelHexRecord = (IntelHexRecord) obj;
        return this.f29368a == intelHexRecord.f29368a && i.a(this.f29369b, intelHexRecord.f29369b) && this.f29370c == intelHexRecord.f29370c && this.f29371d == intelHexRecord.f29371d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29371d) + ((this.f29370c.hashCode() + p.d(Integer.hashCode(this.f29368a) * 31, 31, this.f29369b)) * 31);
    }

    public final String toString() {
        return "IntelHexRecord(address=" + this.f29368a + ", data=" + this.f29369b + ", recordType=" + this.f29370c + ", checksum=" + this.f29371d + ")";
    }
}
