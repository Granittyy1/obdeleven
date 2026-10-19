package kotlinx.serialization;

import androidx.compose.foundation.C0936h;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;

    public MissingFieldException() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        i.e(missingFields, "missingFields");
        this.missingFields = missingFields;
    }

    public final List<String> a() {
        return this.missingFields;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String serialName) {
        this(M1.k(str), C0936h.d("Field '", str, "' is required for type with serial name '", serialName, "', but it was missing"), null);
        i.e(serialName, "serialName");
    }
}
