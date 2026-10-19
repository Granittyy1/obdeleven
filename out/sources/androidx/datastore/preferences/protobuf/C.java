package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;

/* JADX INFO: compiled from: MapEntryLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class C<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f17097a;

    /* JADX INFO: compiled from: MapEntryLite.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat$FieldType f17098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WireFormat$FieldType f17099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PreferencesProto$Value f17100c;

        public a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
            this.f17098a = wireFormat$FieldType;
            this.f17099b = wireFormat$FieldType2;
            this.f17100c = preferencesProto$Value;
        }
    }

    public C(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
        this.f17097a = new a<>(wireFormat$FieldType, wireFormat$FieldType2, preferencesProto$Value);
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v10) {
        return C1327q.b(aVar.f17099b, 2, v10) + C1327q.b(aVar.f17098a, 1, k10);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        C1327q.l(codedOutputStream, aVar.f17098a, 1, k10);
        C1327q.l(codedOutputStream, aVar.f17099b, 2, v10);
    }
}
