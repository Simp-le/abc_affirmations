package com.abc.affirmations.data

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.abc.affirmations.R
import com.abc.affirmations.model.Affirmation

class AffirmationDataProvider : PreviewParameterProvider<Affirmation> {
    override val values = sequenceOf(
        Affirmation(
            stringResourceId = R.string.affirmation1,
            imageResourceId = R.drawable.image1
        )
    )
}

class AffirmationListDataProvider : PreviewParameterProvider<List<Affirmation>> {
    override val values = sequenceOf(
        listOf(
            Affirmation(
                stringResourceId = R.string.affirmation1,
                imageResourceId = R.drawable.image1
            ),
            Affirmation(
                stringResourceId = R.string.affirmation2,
                imageResourceId = R.drawable.image2
            )
        )
    )
}