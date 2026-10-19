package p194p8;

import com.obdeleven.service.enums.ValueUnit;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import p121j8.c;
import p134k8.T1;

/* JADX INFO: compiled from: Measurement.java */
/* JADX INFO: loaded from: classes3.dex */
public interface j {
    ArrayList a(ValueUnit valueUnit);

    Task<List<T1>> b(ValueUnit valueUnit);

    int getChannel();

    c getLabel();

    String getName();

    default void c(c cVar) {
    }
}
