package io.intercom.android.sdk.survey.ui.questiontype;

import io.intercom.android.sdk.survey.ui.models.Answer;

/* JADX INFO: compiled from: AnswerClickData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AnswerClickData {
    public static final int $stable = 8;
    private final Answer.MediaAnswer.MediaItem clickedItem;
    private final String questionId;

    public AnswerClickData(Answer.MediaAnswer.MediaItem clickedItem, String questionId) {
        kotlin.jvm.internal.i.e(clickedItem, "clickedItem");
        kotlin.jvm.internal.i.e(questionId, "questionId");
        this.clickedItem = clickedItem;
        this.questionId = questionId;
    }

    public static /* synthetic */ AnswerClickData copy$default(AnswerClickData answerClickData, Answer.MediaAnswer.MediaItem mediaItem, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mediaItem = answerClickData.clickedItem;
        }
        if ((i10 & 2) != 0) {
            str = answerClickData.questionId;
        }
        return answerClickData.copy(mediaItem, str);
    }

    public final Answer.MediaAnswer.MediaItem component1() {
        return this.clickedItem;
    }

    public final String component2() {
        return this.questionId;
    }

    public final AnswerClickData copy(Answer.MediaAnswer.MediaItem clickedItem, String questionId) {
        kotlin.jvm.internal.i.e(clickedItem, "clickedItem");
        kotlin.jvm.internal.i.e(questionId, "questionId");
        return new AnswerClickData(clickedItem, questionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerClickData)) {
            return false;
        }
        AnswerClickData answerClickData = (AnswerClickData) obj;
        return kotlin.jvm.internal.i.a(this.clickedItem, answerClickData.clickedItem) && kotlin.jvm.internal.i.a(this.questionId, answerClickData.questionId);
    }

    public final Answer.MediaAnswer.MediaItem getClickedItem() {
        return this.clickedItem;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return this.questionId.hashCode() + (this.clickedItem.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnswerClickData(clickedItem=");
        sb2.append(this.clickedItem);
        sb2.append(", questionId=");
        return B7.b.g(sb2, this.questionId, ')');
    }
}
