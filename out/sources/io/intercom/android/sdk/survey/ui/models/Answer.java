package io.intercom.android.sdk.survey.ui.models;

import A1.C0575j;
import Q8.d;
import Q9.a;
import Q9.b;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: Answer.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Answer {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Answer.kt */
    public static final class DateTimeAnswer extends Answer {
        public static final int $stable = 0;
        private final long date;
        private final int hours;
        private final int minutes;

        public DateTimeAnswer(long j, int i10, int i11) {
            super(null);
            this.date = j;
            this.hours = i10;
            this.minutes = i11;
        }

        public static /* synthetic */ DateTimeAnswer copy$default(DateTimeAnswer dateTimeAnswer, long j, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j = dateTimeAnswer.date;
            }
            if ((i12 & 2) != 0) {
                i10 = dateTimeAnswer.hours;
            }
            if ((i12 & 4) != 0) {
                i11 = dateTimeAnswer.minutes;
            }
            return dateTimeAnswer.copy(j, i10, i11);
        }

        private final String formatTime(int i10) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            if (i10 < 0) {
                i10 = 0;
            }
            String str = decimalFormat.format(Integer.valueOf(i10));
            i.d(str, "format(...)");
            return str;
        }

        public final long component1() {
            return this.date;
        }

        public final int component2() {
            return this.hours;
        }

        public final int component3() {
            return this.minutes;
        }

        public final DateTimeAnswer copy(long j, int i10, int i11) {
            return new DateTimeAnswer(j, i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateTimeAnswer)) {
                return false;
            }
            DateTimeAnswer dateTimeAnswer = (DateTimeAnswer) obj;
            return this.date == dateTimeAnswer.date && this.hours == dateTimeAnswer.hours && this.minutes == dateTimeAnswer.minutes;
        }

        public final String getAnswer() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getDateAsString());
            sb2.append('T');
            sb2.append(formatTime(this.hours));
            sb2.append(':');
            return d.a(sb2, formatTime(this.minutes), ":00Z");
        }

        public final long getDate() {
            return this.date;
        }

        public final String getDateAsString() {
            long j = this.date;
            if (j == -1) {
                return "";
            }
            String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(j, "YYYY-MM-dd");
            i.d(timeInMillisAsDate, "formatTimeInMillisAsDate(...)");
            return timeInMillisAsDate;
        }

        public final int getHours() {
            return this.hours;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.date);
            sb2.append(this.hours);
            sb2.append(this.minutes);
            return sb2.toString().length();
        }

        public final String getLocalTime() {
            int i10;
            int i11 = this.hours;
            if (i11 == -1 || (i10 = this.minutes) == -1) {
                return "";
            }
            String fromUtcTime = TimeFormatter.formatFromUtcTime(i11, i10);
            i.d(fromUtcTime, "formatFromUtcTime(...)");
            return fromUtcTime;
        }

        public final int getMinutes() {
            return this.minutes;
        }

        public int hashCode() {
            return Integer.hashCode(this.minutes) + q.b(this.hours, Long.hashCode(this.date) * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("DateTimeAnswer(date=");
            sb2.append(this.date);
            sb2.append(", hours=");
            sb2.append(this.hours);
            sb2.append(", minutes=");
            return C0575j.b(sb2, this.minutes, ')');
        }
    }

    /* JADX INFO: compiled from: Answer.kt */
    public static final class MediaAnswer extends Answer {
        public static final int $stable = 8;
        private final List<MediaItem> mediaItems;

        /* JADX INFO: compiled from: Answer.kt */
        public static abstract class FileUploadError {
            public static final int $stable = 8;
            private final List<StringProvider.StringRes> errorMessages;

            /* JADX INFO: compiled from: Answer.kt */
            public static final class FileLimitExceeded extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileLimitExceeded(List<StringProvider.StringRes> message) {
                    super(message, null);
                    i.e(message, "message");
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class FileTooLarge extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileTooLarge(List<StringProvider.StringRes> message) {
                    super(message, null);
                    i.e(message, "message");
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class UnsupportedFileType extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedFileType(List<StringProvider.StringRes> message) {
                    super(message, null);
                    i.e(message, "message");
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class UploadFailed extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFailed(List<StringProvider.StringRes> message) {
                    super(message, null);
                    i.e(message, "message");
                }
            }

            public /* synthetic */ FileUploadError(List list, e eVar) {
                this(list);
            }

            public final List<StringProvider.StringRes> getErrorMessages() {
                return this.errorMessages;
            }

            private FileUploadError(List<StringProvider.StringRes> list) {
                this.errorMessages = list;
            }
        }

        /* JADX INFO: compiled from: Answer.kt */
        public static abstract class FileUploadStatus {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: Answer.kt */
            public static final class Error extends FileUploadStatus {
                public static final int $stable = 8;
                private final FileUploadError error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(FileUploadError error) {
                    super(null);
                    i.e(error, "error");
                    this.error = error;
                }

                public static /* synthetic */ Error copy$default(Error error, FileUploadError fileUploadError, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        fileUploadError = error.error;
                    }
                    return error.copy(fileUploadError);
                }

                public final FileUploadError component1() {
                    return this.error;
                }

                public final Error copy(FileUploadError error) {
                    i.e(error, "error");
                    return new Error(error);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && i.a(this.error, ((Error) obj).error);
                }

                public final FileUploadError getError() {
                    return this.error;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "Error(error=" + this.error + ')';
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class None extends FileUploadStatus {
                public static final int $stable = 0;
                public static final None INSTANCE = new None();

                private None() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class Queued extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Queued INSTANCE = new Queued();

                private Queued() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class Success extends FileUploadStatus {
                public static final int $stable = 0;
                private final int id;

                public Success(int i10) {
                    super(null);
                    this.id = i10;
                }

                public static /* synthetic */ Success copy$default(Success success, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = success.id;
                    }
                    return success.copy(i10);
                }

                public final int component1() {
                    return this.id;
                }

                public final Success copy(int i10) {
                    return new Success(i10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && this.id == ((Success) obj).id;
                }

                public final int getId() {
                    return this.id;
                }

                public int hashCode() {
                    return Integer.hashCode(this.id);
                }

                public String toString() {
                    return C0575j.b(new StringBuilder("Success(id="), this.id, ')');
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class Uploading extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Uploading INSTANCE = new Uploading();

                private Uploading() {
                    super(null);
                }
            }

            public /* synthetic */ FileUploadStatus(e eVar) {
                this();
            }

            private FileUploadStatus() {
            }
        }

        /* JADX INFO: compiled from: Answer.kt */
        public static final class MediaItem {
            public static final int $stable = 8;
            private final X _uploadStatus$delegate;
            private final MediaData.Media data;
            private final N0 uploadStatus$delegate;

            public MediaItem(MediaData.Media data) {
                i.e(data, "data");
                this.data = data;
                this._uploadStatus$delegate = J0.f(FileUploadStatus.None.INSTANCE);
                this.uploadStatus$delegate = J0.d(new a(0, this));
            }

            public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, MediaData.Media media, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    media = mediaItem.data;
                }
                return mediaItem.copy(media);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private final FileUploadStatus get_uploadStatus() {
                return (FileUploadStatus) this._uploadStatus$delegate.getValue();
            }

            private final void set_uploadStatus(FileUploadStatus fileUploadStatus) {
                this._uploadStatus$delegate.setValue(fileUploadStatus);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FileUploadStatus uploadStatus_delegate$lambda$0(MediaItem this$0) {
                i.e(this$0, "this$0");
                return this$0.get_uploadStatus();
            }

            public final MediaData.Media component1() {
                return this.data;
            }

            public final MediaItem copy(MediaData.Media data) {
                i.e(data, "data");
                return new MediaItem(data);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MediaItem) && i.a(this.data, ((MediaItem) obj).data);
            }

            public final MediaData.Media getData() {
                return this.data;
            }

            public final FileUploadStatus getUploadStatus() {
                return (FileUploadStatus) this.uploadStatus$delegate.getValue();
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public final void setUploadStatus(FileUploadStatus uploadStatus) {
                i.e(uploadStatus, "uploadStatus");
                set_uploadStatus(uploadStatus);
            }

            public String toString() {
                return "MediaItem(data=" + this.data + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAnswer(List<MediaItem> mediaItems) {
            super(null);
            i.e(mediaItems, "mediaItems");
            this.mediaItems = mediaItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaAnswer copy$default(MediaAnswer mediaAnswer, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = mediaAnswer.mediaItems;
            }
            return mediaAnswer.copy(list);
        }

        public final List<MediaItem> component1() {
            return this.mediaItems;
        }

        public final MediaAnswer copy(List<MediaItem> mediaItems) {
            i.e(mediaItems, "mediaItems");
            return new MediaAnswer(mediaItems);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MediaAnswer) && i.a(this.mediaItems, ((MediaAnswer) obj).mediaItems);
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.mediaItems.size();
        }

        public final List<MediaItem> getMediaItems() {
            return this.mediaItems;
        }

        public int hashCode() {
            return this.mediaItems.hashCode();
        }

        public String toString() {
            return d.b(new StringBuilder("MediaAnswer(mediaItems="), this.mediaItems, ')');
        }
    }

    /* JADX INFO: compiled from: Answer.kt */
    public static final class MultipleAnswer extends Answer {
        public static final int $stable = 8;
        private final Set<String> answers;
        private final OtherAnswer otherAnswer;

        /* JADX INFO: compiled from: Answer.kt */
        public static abstract class OtherAnswer {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: Answer.kt */
            public static final class NotSelected extends OtherAnswer {
                public static final int $stable = 0;
                public static final NotSelected INSTANCE = new NotSelected();

                private NotSelected() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class SelectedNoText extends OtherAnswer {
                public static final int $stable = 0;
                public static final SelectedNoText INSTANCE = new SelectedNoText();

                private SelectedNoText() {
                    super(null);
                }
            }

            /* JADX INFO: compiled from: Answer.kt */
            public static final class SelectedWithText extends OtherAnswer {
                public static final int $stable = 0;
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectedWithText(String text) {
                    super(null);
                    i.e(text, "text");
                    this.text = text;
                }

                public static /* synthetic */ SelectedWithText copy$default(SelectedWithText selectedWithText, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = selectedWithText.text;
                    }
                    return selectedWithText.copy(str);
                }

                public final String component1() {
                    return this.text;
                }

                public final SelectedWithText copy(String text) {
                    i.e(text, "text");
                    return new SelectedWithText(text);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SelectedWithText) && i.a(this.text, ((SelectedWithText) obj).text);
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @Override // io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer.OtherAnswer
                public String toString() {
                    return this.text;
                }
            }

            public /* synthetic */ OtherAnswer(e eVar) {
                this();
            }

            public String toString() {
                return "";
            }

            private OtherAnswer() {
            }
        }

        public /* synthetic */ MultipleAnswer(Set set, OtherAnswer otherAnswer, int i10, e eVar) {
            this(set, (i10 & 2) != 0 ? OtherAnswer.NotSelected.INSTANCE : otherAnswer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleAnswer copy$default(MultipleAnswer multipleAnswer, Set set, OtherAnswer otherAnswer, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = multipleAnswer.answers;
            }
            if ((i10 & 2) != 0) {
                otherAnswer = multipleAnswer.otherAnswer;
            }
            return multipleAnswer.copy(set, otherAnswer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence getLength$lambda$1(String it) {
            i.e(it, "it");
            return it;
        }

        public final Set<String> component1() {
            return this.answers;
        }

        public final OtherAnswer component2() {
            return this.otherAnswer;
        }

        public final MultipleAnswer copy(Set<String> answers, OtherAnswer otherAnswer) {
            i.e(answers, "answers");
            i.e(otherAnswer, "otherAnswer");
            return new MultipleAnswer(answers, otherAnswer);
        }

        public final Answer copyWithAnswerToggled(String answer) {
            i.e(answer, "answer");
            Set setR0 = kotlin.collections.q.r0(this.answers);
            if (this.answers.contains(answer)) {
                setR0.remove(answer);
            } else {
                setR0.add(answer);
            }
            return (setR0.isEmpty() && (this.otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, setR0, null, 2, null);
        }

        public final Answer copyWithOther(OtherAnswer otherAnswer) {
            i.e(otherAnswer, "otherAnswer");
            return (this.answers.isEmpty() && (otherAnswer instanceof OtherAnswer.NotSelected)) ? NoAnswer.ResetNoAnswer.INSTANCE : copy$default(this, null, otherAnswer, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultipleAnswer)) {
                return false;
            }
            MultipleAnswer multipleAnswer = (MultipleAnswer) obj;
            return i.a(this.answers, multipleAnswer.answers) && i.a(this.otherAnswer, multipleAnswer.otherAnswer);
        }

        /* JADX INFO: renamed from: getAnswers, reason: collision with other method in class */
        public final Set<String> m407getAnswers() {
            return this.answers;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return kotlin.collections.q.U(this.answers, null, null, null, new b(0), 31).length();
        }

        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public int hashCode() {
            return this.otherAnswer.hashCode() + (this.answers.hashCode() * 31);
        }

        public String toString() {
            return "MultipleAnswer(answers=" + this.answers + ", otherAnswer=" + this.otherAnswer + ')';
        }

        public final List<String> getAnswers() {
            ListBuilder listBuilderF = M1.f();
            listBuilderF.addAll(kotlin.collections.q.o0(this.answers));
            OtherAnswer otherAnswer = this.otherAnswer;
            if (!i.a(otherAnswer, OtherAnswer.NotSelected.INSTANCE)) {
                if (i.a(otherAnswer, OtherAnswer.SelectedNoText.INSTANCE)) {
                    listBuilderF.add("Other");
                } else {
                    if (!(otherAnswer instanceof OtherAnswer.SelectedWithText)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listBuilderF.add(((OtherAnswer.SelectedWithText) this.otherAnswer).getText());
                }
            }
            return listBuilderF.I();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleAnswer(Set<String> answers, OtherAnswer otherAnswer) {
            super(null);
            i.e(answers, "answers");
            i.e(otherAnswer, "otherAnswer");
            this.answers = answers;
            this.otherAnswer = otherAnswer;
        }
    }

    /* JADX INFO: compiled from: Answer.kt */
    public static abstract class NoAnswer extends Answer {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: Answer.kt */
        public static final class InitialNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final InitialNoAnswer INSTANCE = new InitialNoAnswer();

            private InitialNoAnswer() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: Answer.kt */
        public static final class ResetNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final ResetNoAnswer INSTANCE = new ResetNoAnswer();

            private ResetNoAnswer() {
                super(null);
            }
        }

        public /* synthetic */ NoAnswer(e eVar) {
            this();
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return 0;
        }

        private NoAnswer() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Answer.kt */
    public static final class SingleAnswer extends Answer {
        public static final int $stable = 0;
        private final String answer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleAnswer(String answer) {
            super(null);
            i.e(answer, "answer");
            this.answer = answer;
        }

        public static /* synthetic */ SingleAnswer copy$default(SingleAnswer singleAnswer, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = singleAnswer.answer;
            }
            return singleAnswer.copy(str);
        }

        public final String component1() {
            return this.answer;
        }

        public final SingleAnswer copy(String answer) {
            i.e(answer, "answer");
            return new SingleAnswer(answer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SingleAnswer) && i.a(this.answer, ((SingleAnswer) obj).answer);
        }

        public final String getAnswer() {
            return this.answer;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.answer.length();
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("SingleAnswer(answer="), this.answer, ')');
        }
    }

    public /* synthetic */ Answer(e eVar) {
        this();
    }

    public abstract int getLength();

    private Answer() {
    }
}
