package io.intercom.android.sdk.survey;

import Q8.d;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ValidationError {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class NoValidationError extends ValidationError {
        public static final int $stable = 0;
        public static final NoValidationError INSTANCE = new NoValidationError();

        private NoValidationError() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class Unchecked extends ValidationError {
        public static final int $stable = 0;
        public static final Unchecked INSTANCE = new Unchecked();

        private Unchecked() {
            super(null);
        }
    }

    public /* synthetic */ ValidationError(e eVar) {
        this();
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class ValidationStringError extends ValidationError {
        public static final int $stable = 8;
        private final List<Pair<String, String>> params;
        private final int stringRes;

        public ValidationStringError(int i10, List list, int i11, e eVar) {
            this(i10, (i11 & 2) != 0 ? EmptyList.f42983b : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationStringError copy$default(ValidationStringError validationStringError, int i10, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = validationStringError.stringRes;
            }
            if ((i11 & 2) != 0) {
                list = validationStringError.params;
            }
            return validationStringError.copy(i10, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        public final ValidationStringError copy(int i10, List<Pair<String, String>> params) {
            i.e(params, "params");
            return new ValidationStringError(i10, params);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationStringError)) {
                return false;
            }
            ValidationStringError validationStringError = (ValidationStringError) obj;
            return this.stringRes == validationStringError.stringRes && i.a(this.params, validationStringError.params);
        }

        public final List<Pair<String, String>> getParams() {
            return this.params;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return this.params.hashCode() + (Integer.hashCode(this.stringRes) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationStringError(stringRes=");
            sb2.append(this.stringRes);
            sb2.append(", params=");
            return d.b(sb2, this.params, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationStringError(int i10, List<Pair<String, String>> params) {
            super(null);
            i.e(params, "params");
            this.stringRes = i10;
            this.params = params;
        }
    }

    private ValidationError() {
    }
}
