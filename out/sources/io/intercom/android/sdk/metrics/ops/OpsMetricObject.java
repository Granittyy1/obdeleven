package io.intercom.android.sdk.metrics.ops;

import B1.a;
import Q8.d;

/* JADX INFO: loaded from: classes3.dex */
public class OpsMetricObject {
    private final String id;
    private final String name;
    private final String type;
    private final long value;

    public OpsMetricObject(String str, String str2, long j, String str3) {
        this.type = str;
        this.name = str2;
        this.value = j;
        this.id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsMetricObject opsMetricObject = (OpsMetricObject) obj;
        if (this.value == opsMetricObject.value && this.type.equals(opsMetricObject.type) && this.name.equals(opsMetricObject.name)) {
            return this.id.equals(opsMetricObject.id);
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        int iB = a.b(this.name, this.type.hashCode() * 31, 31);
        long j = this.value;
        return this.id.hashCode() + ((iB + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OpsMetricObject{type='");
        sb2.append(this.type);
        sb2.append("', name='");
        sb2.append(this.name);
        sb2.append("', value=");
        sb2.append(this.value);
        sb2.append(", id='");
        return d.a(sb2, this.id, "'}");
    }
}
