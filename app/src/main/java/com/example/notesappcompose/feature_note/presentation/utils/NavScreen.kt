package com.example.notesappcompose.feature_note.presentation.utils

sealed class NavScreen(val route: String) {
    object NotesScreen : NavScreen("notes_screen")
    object AddEditNoteScreen : NavScreen("add_edit_note_screen")
}