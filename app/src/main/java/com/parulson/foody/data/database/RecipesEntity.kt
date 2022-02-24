package com.parulson.foody.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.parulson.foody.models.FoodRecipe
import com.parulson.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int =0
}